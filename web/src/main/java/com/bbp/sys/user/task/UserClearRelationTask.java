/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.task;

import com.bbp.common.repository.RepositoryHelper;
import com.bbp.common.utils.LogUtils;
import com.bbp.sys.organization.service.JobService;
import com.bbp.sys.organization.service.OrganizationService;
import com.bbp.sys.user.entity.User;
import com.bbp.sys.user.entity.UserOrganizationJob;
import com.bbp.sys.user.service.UserService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 包名：com.bbp.sys.user.task
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  20:52
 * <p>
 * 描述：<p>
 *  清理无关联的User-Organization/Job关系<p>
 *  1、User-Organization/Job
 */
@Service()
public class UserClearRelationTask {

    @Autowired
    private UserService userService;

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private JobService jobService;


    /**
     * 清除删除的用户-组织机构/工作职务对应的关系
     */
    public void clearDeletedUserRelation() {

        //删除用户不存在的情况的UserOrganizationJob（比如手工从数据库物理删除）。。
        userService.deleteUserOrganizationJobOnNotExistsUser();

        Page<UserOrganizationJob> page = null;

        int pn = 0;
        final int PAGE_SIZE = 100;
        Pageable pageable = null;
        do {
            pageable = new PageRequest(pn++, PAGE_SIZE);
            page = userService.findUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);

            //开启新事物清除
            try {
                UserClearRelationTask userClearRelationTask = (UserClearRelationTask) AopContext.currentProxy();
                userClearRelationTask.doClear(page.getContent());
            } catch (Exception e) {
                //出异常也无所谓
                LogUtils.logError("clear user relation error", e);

            }
            //清空会话
            RepositoryHelper.clear();

        } while (page.hasNextPage());

    }

    public void doClear(Collection<UserOrganizationJob> userOrganizationJobColl) {
        for (UserOrganizationJob userOrganizationJob : userOrganizationJobColl) {

            User user = userOrganizationJob.getUser();

            if (!organizationService.exists(userOrganizationJob.getOrganizationId())) {
                user.getOrganizationJobs().remove(userOrganizationJob);//如果是组织机构删除了 直接移除
            } else if (!jobService.exists(userOrganizationJob.getJobId())) {
                user.getOrganizationJobs().remove(userOrganizationJob);
                userOrganizationJob.setJobId(null);
                user.getOrganizationJobs().add(userOrganizationJob);
            }
            //不加也可 加上的目的是为了清缓存
            userService.update(user);
        }

    }
}
