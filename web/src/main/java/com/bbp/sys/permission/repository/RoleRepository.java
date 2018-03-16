/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.permission.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.sys.permission.entity.Role;
import com.bbp.sys.permission.entity.RoleResourcePermission;
import org.springframework.data.jpa.repository.Query;

/**
 * 包名：com.bbp.sys.permission.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:46
 * <p>
 * 描述：
 *
 */
public interface RoleRepository extends BaseRepository<Role, Long> {

    @Query("from RoleResourcePermission where role=?1 and resourceId=?2")
    RoleResourcePermission findRoleResourcePermission(Role role, Long resourceId);
}
