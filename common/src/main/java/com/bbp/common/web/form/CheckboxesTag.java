/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.common.web.form;

import com.bbp.common.web.form.bind.SearchBindStatus;
import org.springframework.web.servlet.support.BindStatus;

import javax.servlet.jsp.JspException;

/**
 * 包名：com.bbp.common.web.form
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/10  22:42
 * <p>
 * 描述：
 * <p>取值时
 * <p>1、先取parameter
 * <p>2、如果找不到再找attribute (page--->request--->session--->application)
 */
public class CheckboxesTag extends org.springframework.web.servlet.tags.form.CheckboxesTag {

    private BindStatus bindStatus = null;

    @Override
    protected BindStatus getBindStatus() throws JspException {
        if (this.bindStatus == null) {
            this.bindStatus = SearchBindStatus.create(pageContext, getName(), getRequestContext(), false);
        }
        return this.bindStatus;
    }

    @Override
    protected String getPropertyPath() throws JspException {
        return getPath();
    }


    @Override
    public void doFinally() {
        super.doFinally();
        this.bindStatus = null;
    }

}
