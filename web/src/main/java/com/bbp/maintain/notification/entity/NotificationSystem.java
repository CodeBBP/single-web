/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.notification.entity;

/**
 * 包名：com.bbp.maintain.notification.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:24
 * <p>
 * 描述：触发的子系统
 *
 */
public enum NotificationSystem {

    system("系统"), excel("excel");

    private final String info;

    private NotificationSystem(final String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

}
