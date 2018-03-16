/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.product.entity;

import com.bbp.common.entity.BaseEntity;
import com.bbp.common.plugin.entity.Movable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 包名：com.bbp.showcase.product.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:26
 * <p>
 * 描述：产品类别
 *  
 */
@Entity
@Table(name = "showcase_category")
public class Category extends BaseEntity<Long> implements Movable {

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Integer weight;


    @Column(name = "is_show")
    private Boolean show;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getWeight() {
        return weight;
    }

    @Override
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }
}
