/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.notification.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.maintain.notification.entity.NotificationTemplate;
import org.springframework.data.jpa.repository.Query;

/**
 * 包名：com.bbp.maintain.notification.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:26
 * <p>
 * 描述：
 *
 */
public interface NotificationTemplateRepository extends BaseRepository<NotificationTemplate, Long> {

    @Query("from NotificationTemplate o where name=?1")
    NotificationTemplate findByName(String name);
}
