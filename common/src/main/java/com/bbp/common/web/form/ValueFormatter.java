/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.common.web.form;

import org.springframework.util.ObjectUtils;
import org.springframework.web.util.HtmlUtils;

/**
 * 包名：com.bbp.common.web.form
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/10  22:47
 * <p>
 * 描述：
 *
 */
public class ValueFormatter {
    public static String getDisplayString(Object value, boolean htmlEscape) {
        String displayValue = ObjectUtils.getDisplayString(value);
        return (htmlEscape ? HtmlUtils.htmlEscape(displayValue) : displayValue);
    }
}
