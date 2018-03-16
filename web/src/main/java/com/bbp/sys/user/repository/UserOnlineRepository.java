/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.sys.user.entity.UserOnline;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * 包名：com.bbp.sys.user.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:53
 * <p>
 * 描述：
 *  
 */
public interface UserOnlineRepository extends BaseRepository<UserOnline, String> {

    @Query("from UserOnline o where o.lastAccessTime < ?1 order by o.lastAccessTime asc")
    Page<UserOnline> findExpiredUserOnlineList(Date expiredDate, Pageable pageable);

    @Modifying
    @Query("delete from UserOnline o where o.id in (?1)")
    void batchDelete(List<String> needExpiredIdList);
}
