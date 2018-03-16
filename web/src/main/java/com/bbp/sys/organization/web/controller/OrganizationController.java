/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.organization.web.controller;

import com.bbp.common.Constants;
import com.bbp.common.plugin.web.controller.BaseTreeableController;
import com.bbp.sys.organization.entity.Organization;
import com.bbp.sys.organization.entity.OrganizationType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 包名：com.bbp.sys.organization.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:44
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/admin/sys/organization/organization")
public class OrganizationController extends BaseTreeableController<Organization, Long> {

    public OrganizationController() {
        setResourceIdentity("sys:organization");
    }

    @Override
    protected void setCommonData(Model model) {
        super.setCommonData(model);
        model.addAttribute("types", OrganizationType.values());
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
            Organization organization = baseService.findOne(id);
            organization.setShow(newStatus);
            baseService.update(organization);
        }

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "操作成功！");

        return "redirect:" + request.getAttribute(Constants.BACK_URL);
    }

}
