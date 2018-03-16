/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.sys.user.entity.UserLastOnline;

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
public interface UserLastOnlineRepository extends BaseRepository<UserLastOnline, Long> {

    UserLastOnline findByUserId(Long userId);
}
