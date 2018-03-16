/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.index.web.controller;

import com.bbp.maintain.push.service.PushApi;
import com.bbp.personal.calendar.service.CalendarService;
import com.bbp.personal.message.service.MessageService;
import com.bbp.sys.resource.entity.tmp.Menu;
import com.bbp.sys.resource.service.ResourceService;
import com.bbp.sys.user.entity.User;
import com.bbp.sys.user.web.bind.annotation.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 包名：com.bbp.index.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:00
 * <p>
 * 描述：
 *  
 */
@Controller("adminIndexController")
@RequestMapping("/admin")
public class IndexController {

    @Autowired
    private ResourceService resourceService;

    @Autowired
    private PushApi pushApi;

    @Autowired
    private MessageService messageService;

    @Autowired
    private CalendarService calendarService;


    @RequestMapping(value = {"/{index:index;?.*}"}) //spring3.2.2 bug see  http://jinnianshilongnian.iteye.com/blog/1831408
    public String index(@CurrentUser User user, Model model) {

        List<Menu> menus = resourceService.findMenus(user);
        model.addAttribute("menus", menus);

        pushApi.offline(user.getId());

        return "admin/index/index";
    }


    @RequestMapping(value = "/welcome")
    public String welcome(@CurrentUser User loginUser, Model model) {

        //未读消息
        Long messageUnreadCount = messageService.countUnread(loginUser.getId());
        model.addAttribute("messageUnreadCount", messageUnreadCount);

        //最近3天的日历
        model.addAttribute("calendarCount", calendarService.countRecentlyCalendar(loginUser.getId(), 2));

        return "admin/index/welcome";
    }





}
