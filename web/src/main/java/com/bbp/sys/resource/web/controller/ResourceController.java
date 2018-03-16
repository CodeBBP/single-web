/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.resource.web.controller;

import com.bbp.common.Constants;
import com.bbp.common.plugin.web.controller.BaseTreeableController;
import com.bbp.sys.resource.entity.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 包名：com.bbp.sys.resource.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:49
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/admin/sys/resource")
public class ResourceController extends BaseTreeableController<Resource, Long> {

    public ResourceController() {
        setResourceIdentity("sys:resource");
    }

    @RequestMapping(value = "/changeStatus/{newStatus}")
    public String changeStatus(
            HttpServletRequest request,
            @PathVariable("newStatus") Boolean newStatus,
            @RequestParam("ids") Long[] ids,
            RedirectAttributes redirectAttributes
    ) {

        this.permissionList.assertHasUpdatePermission();

        for (Long id : ids) {
            Resource resource = baseService.findOne(id);
            resource.setShow(newStatus);
            baseService.update(resource);
        }

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "操作成功！");

        return "redirect:" + request.getAttribute(Constants.BACK_URL);
    }

}
