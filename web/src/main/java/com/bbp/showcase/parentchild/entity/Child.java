/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.parentchild.entity;

import com.bbp.common.entity.BaseEntity;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 包名：com.bbp.showcase.parentchild.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:23
 * <p>
 * 描述：
 *  
 */
@Entity
@Table(name = "showcase_child")
public class Child extends BaseEntity<Long> {

    @OneToOne(optional = true)
    @Fetch(FetchMode.SELECT)
    private Parent parent;

    @NotNull(message = "not.null")
    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ParentChildType type;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(name = "beginTime")
    private Date beginTime;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(name = "endTime")
    private Date endTime;

    @Column(name = "is_show")
    private Boolean show;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParentChildType getType() {
        return type;
    }

    public void setType(ParentChildType type) {
        this.type = type;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }
}
