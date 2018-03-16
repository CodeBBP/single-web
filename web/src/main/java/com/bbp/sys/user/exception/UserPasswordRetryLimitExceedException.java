/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.exception;

/**
 * 包名：com.bbp.sys.user.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  20:49
 * <p>
 * 描述：
 *
 */
public class UserPasswordRetryLimitExceedException extends UserException {
    public UserPasswordRetryLimitExceedException(int retryLimitCount) {
        super("user.password.retry.limit.exceed", new Object[]{retryLimitCount});
    }
}
