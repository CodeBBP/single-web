/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.personal.message.entity;

import com.bbp.common.entity.BaseEntity;
import org.hibernate.annotations.Proxy;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 包名：com.bbp.personal.message.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:41
 * <p>
 * 描述：
 *
 */
@Entity
@Table(name = "personal_message_content")
@Proxy(lazy = true, proxyClass = MessageContent.class)
public class MessageContent extends BaseEntity<Long> {


    @OneToOne(fetch = FetchType.LAZY)
    private Message message;

    /**
     * 消息内容
     */
    @Length(min = 5, max = 50000, message = "{length.not.valid}")
    private String content;


    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
