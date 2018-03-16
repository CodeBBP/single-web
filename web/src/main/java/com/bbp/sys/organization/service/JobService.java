/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.organization.service;

import com.bbp.common.plugin.serivce.BaseTreeableService;
import com.bbp.sys.organization.entity.Job;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Set;

/**
 * 包名：com.bbp.sys.organization.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:43
 * <p>
 * 描述：
 *
 */
@Service
public class JobService extends BaseTreeableService<Job, Long> {


    /**
     * 过滤仅获取可显示的数据
     *
     * @param jobIds
     * @param organizationJobIds
     */
    public void filterForCanShow(Set<Long> jobIds, Set<Long[]> organizationJobIds) {

        Iterator<Long> iter1 = jobIds.iterator();

        while (iter1.hasNext()) {
            Long id = iter1.next();
            Job o = findOne(id);
            if (o == null || Boolean.FALSE.equals(o.getShow())) {
                iter1.remove();
            }
        }

        Iterator<Long[]> iter2 = organizationJobIds.iterator();

        while (iter2.hasNext()) {
            Long id = iter2.next()[1];
            Job o = findOne(id);
            if (o == null || Boolean.FALSE.equals(o.getShow())) {
                iter2.remove();
            }
        }

    }
}
