/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.status.audit.entity;

import com.bbp.common.entity.BaseEntity;
import com.bbp.common.plugin.entity.Stateable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * 包名：com.bbp.showcase.status.audit.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:31
 * <p>
 * 描述：
 *  
 */
@Entity
@Table(name = "showcase_status_audit")
public class Audit extends BaseEntity<Long> implements Stateable<Stateable.AuditStatus> {

    /**
     * 标题
     */
    private String name;

    @Enumerated(EnumType.STRING)
    private AuditStatus status = AuditStatus.waiting;

    private String comment;

    @Override
    public AuditStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(AuditStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
