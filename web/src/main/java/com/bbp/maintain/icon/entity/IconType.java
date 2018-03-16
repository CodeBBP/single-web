/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.icon.entity;

/**
 * 包名：com.bbp.maintain.icon.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:18
 * <p>
 * 描述：图标类型
 *
 */
public enum IconType {
    css_class("css类图标"), upload_file("文件图标"), css_sprite("css精灵图标");

    private final String info;

    private IconType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
