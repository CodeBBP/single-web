/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.upload.entity;

import com.bbp.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 包名：com.bbp.showcase.upload.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:35
 * <p>
 * 描述：
 *  
 */
@Entity
@Table(name = "showcase_upload")
public class Upload extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "src")
    private String src;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
