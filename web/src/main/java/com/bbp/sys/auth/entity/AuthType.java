/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.auth.entity;

/**
 * 包名：com.bbp.sys.auth.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  14:32
 * <p>
 * 描述：授权类型
 *
 */
public enum AuthType {

    user("用户"), user_group("用户组"), organization_job("组织机构和工作职务"), organization_group("组织机构组");

    private final String info;

    private AuthType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
