/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.web.controller;

import com.bbp.common.web.controller.BaseCRUDController;
import com.bbp.sys.user.entity.UserLastOnline;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 包名：com.bbp.sys.user.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:56
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/admin/sys/user/lastOnline")
public class UserLastOnlineController extends BaseCRUDController<UserLastOnline, Long> {

    public UserLastOnlineController() {
        setResourceIdentity("sys:userLastOnline");
    }
}
