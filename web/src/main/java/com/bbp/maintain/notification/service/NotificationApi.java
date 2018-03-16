/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.notification.service;

import com.bbp.maintain.notification.exception.TemplateNotFoundException;

import java.util.List;
import java.util.Map;

/**
 * 包名：com.bbp.maintain.notification.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  14:38
 * <p>
 * 描述：通知接口
 *
 */
public interface NotificationApi {

    /**
     * 发送通知
     * @param userId 接收人用户编号
     * @param templateName 模板名称
     * @param context 模板需要的数据
     * @throws TemplateNotFoundException 没有找到相应模板
     */
    public void notify(Long userId, String templateName, Map<String, Object> context) throws TemplateNotFoundException;

    /**
     *
     * id :
     * title
     * content
     * date
     *
     * @param userId
     * @return
     */
    public List<Map<String, Object>> topFiveNotification(Long userId);
}
