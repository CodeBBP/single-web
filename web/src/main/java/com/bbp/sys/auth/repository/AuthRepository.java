/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.auth.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.sys.auth.entity.Auth;

import java.util.Set;

/**
 * 包名：com.bbp.sys.auth.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  14:33
 * <p>
 * 描述：
 *  
 */
public interface AuthRepository extends BaseRepository<Auth, Long> {

    Auth findByUserId(Long userId);

    Auth findByGroupId(Long groupId);

    Auth findByOrganizationIdAndJobId(Long organizationId, Long jobId);

    /**
     * 委托给AuthRepositoryImpl实现
     * @param userId
     * @param groupIds
     * @param organizationIds
     * @param jobIds
     * @param organizationJobIds
     * @return
     */
    public Set<Long> findRoleIds(Long userId, Set<Long> groupIds, Set<Long> organizationIds, Set<Long> jobIds, Set<Long[]> organizationJobIds);

}
