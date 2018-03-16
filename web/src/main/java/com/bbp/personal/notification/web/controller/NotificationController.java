/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.personal.notification.web.controller;

import com.bbp.common.entity.search.SearchOperator;
import com.bbp.common.entity.search.Searchable;
import com.bbp.common.web.bind.annotation.PageableDefaults;
import com.bbp.common.web.controller.BaseController;
import com.bbp.maintain.notification.entity.NotificationData;
import com.bbp.maintain.notification.service.NotificationDataService;
import com.bbp.sys.user.entity.User;
import com.bbp.sys.user.web.bind.annotation.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 包名：com.bbp.personal.notification.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:48
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping("/admin/personal/notification")
public class NotificationController extends BaseController {

    @Autowired
    private NotificationDataService notificationDataService;

    @RequestMapping
    @PageableDefaults(value = 20, sort = "id=desc")
    public String list(@CurrentUser User user, Pageable pageable, Model model) {

        Searchable searchable = Searchable.newSearchable();
        searchable.addSearchFilter("userId", SearchOperator.eq, user.getId());

        Page<NotificationData> page = notificationDataService.findAll(pageable);

        model.addAttribute("page", page);
        if(pageable.getPageNumber() == 0) {
            notificationDataService.markReadAll(user.getId());
        }

        return viewName("list");
    }

    @RequestMapping("/markRead")
    @ResponseBody
    public String markRead(@RequestParam("id") Long id) {
        notificationDataService.markRead(id);
        return "";
    }

}
