/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.web.controller;

import com.bbp.common.web.controller.BaseCRUDController;
import com.bbp.sys.user.entity.UserStatus;
import com.bbp.sys.user.entity.UserStatusHistory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 包名：com.bbp.sys.user.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  20:54
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/admin/sys/user/statusHistory")
public class UserStatusHistoryController extends BaseCRUDController<UserStatusHistory, Long> {

    public UserStatusHistoryController() {
        setListAlsoSetCommonData(true);
        setResourceIdentity("sys:userStatusHistory");
    }


    @Override
    protected void setCommonData(Model model) {
        model.addAttribute("statusList", UserStatus.values());
    }

}
