/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.notification.service;

import com.bbp.common.service.BaseService;
import com.bbp.maintain.notification.entity.NotificationData;
import com.bbp.maintain.notification.repository.NotificationDataRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.maintain.notification.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:27
 * <p>
 * 描述：
 *
 */
@Service
public class NotificationDataService extends BaseService<NotificationData, Long> {

    private NotificationDataRepository getNotificationDataRepository() {
        return (NotificationDataRepository) baseRepository;
    }


    public void markReadAll(final Long userId) {
        getNotificationDataRepository().markReadAll(userId);
    }


    public void markRead(final Long notificationId) {
        NotificationData data = findOne(notificationId);
        if (data == null || data.getRead().equals(Boolean.TRUE)) {
            return;
        }
        data.setRead(Boolean.TRUE);
        update(data);
    }
}
