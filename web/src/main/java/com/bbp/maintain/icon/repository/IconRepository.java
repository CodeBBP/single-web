/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.icon.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.maintain.icon.entity.Icon;

/**
 * 包名：com.bbp.maintain.icon.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:19
 * <p>
 * 描述：
 *  
 */
public interface IconRepository extends BaseRepository<Icon, Long> {
    Icon findByIdentity(String identity);
}
