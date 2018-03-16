/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.sample.entity;

/**
 * 包名：com.bbp.showcase.sample.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:30
 * <p>
 * 描述：
 *
 */
public enum Sex {
    male("男"), female("女");

    private final String info;

    private Sex(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
