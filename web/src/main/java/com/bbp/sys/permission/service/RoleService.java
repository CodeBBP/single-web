/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.permission.service;

import com.google.common.collect.Sets;
import com.bbp.common.service.BaseService;
import com.bbp.sys.permission.entity.Role;
import com.bbp.sys.permission.entity.RoleResourcePermission;
import com.bbp.sys.permission.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 包名：com.bbp.sys.permission.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:46
 * <p>
 * 描述：
 *  
 */
@Service
public class RoleService extends BaseService<Role, Long> {

    public RoleRepository getRoleRepository() {
        return (RoleRepository) baseRepository;
    }

    @Override
    public Role update(Role role) {
        List<RoleResourcePermission> localResourcePermissions = role.getResourcePermissions();
        for (int i = 0, l = localResourcePermissions.size(); i < l; i++) {
            RoleResourcePermission localResourcePermission = localResourcePermissions.get(i);
            localResourcePermission.setRole(role);
            RoleResourcePermission dbResourcePermission = findRoleResourcePermission(localResourcePermission);
            if (dbResourcePermission != null) {//出现在先删除再添加的情况
                dbResourcePermission.setRole(localResourcePermission.getRole());
                dbResourcePermission.setResourceId(localResourcePermission.getResourceId());
                dbResourcePermission.setPermissionIds(localResourcePermission.getPermissionIds());
                localResourcePermissions.set(i, dbResourcePermission);
            }
        }
        return super.update(role);
    }

    private RoleResourcePermission findRoleResourcePermission(RoleResourcePermission roleResourcePermission) {
        return getRoleRepository().findRoleResourcePermission(
                roleResourcePermission.getRole(), roleResourcePermission.getResourceId());
    }

    /**
     * 获取可用的角色列表
     *
     * @param roleIds
     * @return
     */
    public Set<Role> findShowRoles(Set<Long> roleIds) {

        Set<Role> roles = Sets.newHashSet();

        //TODO 如果角色很多 此处应该写查询
        for (Role role : findAll()) {
            if (Boolean.TRUE.equals(role.getShow()) && roleIds.contains(role.getId())) {
                roles.add(role);
            }
        }
        return roles;
    }


}
