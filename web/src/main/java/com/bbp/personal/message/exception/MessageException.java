/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.personal.message.exception;

import com.bbp.common.exception.BaseException;

/**
 * 包名：com.bbp.personal.message.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:46
 * <p>
 * 描述：
 *
 */
public class MessageException extends BaseException {

    public MessageException(String code, Object[] args) {
        super("personal", code, args);
    }
}
