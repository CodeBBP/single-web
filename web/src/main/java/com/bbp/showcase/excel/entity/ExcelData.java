/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.excel.entity;

import com.bbp.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 包名：com.bbp.showcase.excel.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:55
 * <p>
 * 描述：
 *  
 */
@Entity
@Table(name = "showcase_excel_data")
public class ExcelData extends BaseEntity<Long> {

    @Column(name = "content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
}
