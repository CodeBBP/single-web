/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.group.entity;

/**
 * 包名：com.bbp.sys.group.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  17:38
 * <p>
 * 描述：用户组分类
 *
 */
public enum GroupType {

    user("用户组"), organization("组织机构组");

    private final String info;

    private GroupType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
