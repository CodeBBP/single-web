/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.monitor.web.controller;

import com.bbp.common.web.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 包名：com.bbp.monitor.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:37
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping("/admin/monitor/jvm")
@RequiresPermissions("monitor:jvm:*")
public class JvmMonitorController extends BaseController {

    @RequestMapping("")
    public String index() {
        return viewName("index");
    }


}
