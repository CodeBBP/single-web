/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.status.show.entity;

import com.bbp.common.entity.BaseEntity;
import com.bbp.common.plugin.entity.Stateable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * 包名：com.bbp.showcase.status.show.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:32
 * <p>
 * 描述：
 *  
 */
@Entity
@Table(name = "showcase_status_show")
public class Show extends BaseEntity<Long> implements Stateable<Stateable.ShowStatus> {

    /**
     * 标题
     */
    private String name;

    @Enumerated(EnumType.STRING)
    private ShowStatus status;

    @Override
    public ShowStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(ShowStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
