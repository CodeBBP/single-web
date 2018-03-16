/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.extra.task;

import com.bbp.sys.auth.task.AuthRelationClearTask;
import com.bbp.sys.group.task.GroupClearRelationTask;
import com.bbp.sys.permission.task.RoleClearRelationTask;
import com.bbp.sys.user.task.UserClearRelationTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.extra.task
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  20:58
 * <p>
 * 描述：定时清理对象间的关系
 *
 */
@Service("relationClearTask")
public class RelationClearTask {


    @Autowired
    private UserClearRelationTask userClearRelationTask;

    @Autowired
    private GroupClearRelationTask groupClearRelationTask;

    @Autowired
    private RoleClearRelationTask roleClearRelationTask;

    @Autowired
    private AuthRelationClearTask authRelationClearTask;

    public void autoClearRelation() {

        //用户与组织机构/工作职务的关系
        userClearRelationTask.clearDeletedUserRelation();

        //分组与组织机构/工作职务的关系
        groupClearRelationTask.clearDeletedGroupRelation();


        //角色与资源/权限的关系
        roleClearRelationTask.clearDeletedRoleRelation();

        //授权与组织机构、组、角色的关系
        authRelationClearTask.clearDeletedAuthRelation();
    }

}
