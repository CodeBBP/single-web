/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.editor.entity;

import com.bbp.common.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 包名：com.bbp.showcase.editor.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:53
 * <p>
 * 描述：
 *
 */
@Entity
@Table(name = "showcase_editor")
public class Editor extends BaseEntity<Long> {

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
