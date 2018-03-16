/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.notification.service;

import com.bbp.common.service.BaseService;
import com.bbp.maintain.notification.entity.NotificationTemplate;
import com.bbp.maintain.notification.repository.NotificationTemplateRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.maintain.notification.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:29
 * <p>
 * 描述：
 *  
 */
@Service
public class NotificationTemplateService extends BaseService<NotificationTemplate, Long> {

    private NotificationTemplateRepository getNotificationTemplateRepository() {
        return (NotificationTemplateRepository) baseRepository;
    }


    public NotificationTemplate findByName(final String name) {
        return getNotificationTemplateRepository().findByName(name);
    }
}
