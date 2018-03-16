/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.notification.exception;

/**
 * 包名：com.bbp.maintain.notification.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:25
 * <p>
 * 描述：
 *
 */
public class TemplateNotFoundException extends TemplateException {
    public TemplateNotFoundException(String templateName) {
        super("notification.template.not.found", new Object[]{templateName});
    }
}
