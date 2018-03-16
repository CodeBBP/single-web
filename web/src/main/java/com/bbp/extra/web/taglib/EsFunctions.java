/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.extra.web.taglib;

import com.bbp.common.utils.SpringUtils;
import com.bbp.sys.organization.entity.Job;
import com.bbp.sys.organization.entity.Organization;
import com.bbp.sys.organization.service.JobService;
import com.bbp.sys.organization.service.OrganizationService;
import com.bbp.sys.permission.entity.Permission;
import com.bbp.sys.permission.entity.Role;
import com.bbp.sys.permission.service.PermissionService;
import com.bbp.sys.permission.service.RoleService;
import com.bbp.sys.resource.entity.Resource;
import com.bbp.sys.resource.service.ResourceService;

import java.util.Iterator;

/**
 * 包名：com.bbp.extra.web.taglib
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  20:59
 * <p>
 * 描述：提供el中可以使用的一些函数
 *
 */
public class EsFunctions {


    public static boolean in(Iterable iterable, Object obj) {
        if (iterable == null) {
            return false;
        }
        Iterator iterator = iterable.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否存储指定id的组织机构
     *
     * @param id
     * @param onlyDisplayShow 是否仅显示可见的
     * @return
     */
    public static boolean existsOrganization(Long id, Boolean onlyDisplayShow) {
        Organization organization = SpringUtils.getBean(OrganizationService.class).findOne(id);
        if (organization == null) {
            return false;
        }
        if (Boolean.TRUE.equals(onlyDisplayShow) && Boolean.FALSE.equals(organization.getShow())) {
            return false;
        }
        return true;
    }

    /**
     * 判断是否存储指定id的工作职务
     *
     * @param id
     * @param onlyDisplayShow 是否仅显示可见的
     * @return
     */
    public static boolean existsJob(Long id, Boolean onlyDisplayShow) {
        Job job = SpringUtils.getBean(JobService.class).findOne(id);
        if (job == null) {
            return false;
        }
        if (Boolean.TRUE.equals(onlyDisplayShow) && Boolean.FALSE.equals(job.getShow())) {
            return false;
        }
        return true;
    }

    /**
     * 判断是否存储指定id的资源
     *
     * @param id
     * @param onlyDisplayShow 是否仅显示可见的
     * @return
     */
    public static boolean existsResource(Long id, Boolean onlyDisplayShow) {
        Resource resource = SpringUtils.getBean(ResourceService.class).findOne(id);
        if (resource == null) {
            return false;
        }
        if (Boolean.TRUE.equals(onlyDisplayShow) && Boolean.FALSE.equals(resource.getShow())) {
            return false;
        }
        return true;
    }

    /**
     * 判断是否存储指定id的权限
     *
     * @param id
     * @param onlyDisplayShow 是否仅显示可见的
     * @return
     */
    public static boolean existsPermission(Long id, Boolean onlyDisplayShow) {
        Permission permission = SpringUtils.getBean(PermissionService.class).findOne(id);
        if (permission == null) {
            return false;
        }
        if (Boolean.TRUE.equals(onlyDisplayShow) && Boolean.FALSE.equals(permission.getShow())) {
            return false;
        }
        return true;
    }


    /**
     * 判断是否存储指定id的角色
     *
     * @param id
     * @param onlyDisplayShow 是否仅显示可见的
     * @return
     */
    public static boolean existsRole(Long id, Boolean onlyDisplayShow) {
        Role role = SpringUtils.getBean(RoleService.class).findOne(id);
        if (role == null) {
            return false;
        }
        if (Boolean.TRUE.equals(onlyDisplayShow) && Boolean.FALSE.equals(role.getShow())) {
            return false;
        }
        return true;
    }

}
