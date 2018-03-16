/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.product.web.controller;

import com.bbp.common.entity.enums.BooleanEnum;
import com.bbp.common.entity.search.Searchable;
import com.bbp.common.plugin.web.controller.BaseMovableController;
import com.bbp.common.web.bind.annotation.PageableDefaults;
import com.bbp.showcase.product.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 包名：com.bbp.showcase.product.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:28
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/showcase/product/category")
public class CategoryController extends BaseMovableController<Category, Long> {


    public CategoryController() {
        setResourceIdentity("showcase:productCategory");
    }

    @Override
    protected void setCommonData(Model model) {
        model.addAttribute("booleanList", BooleanEnum.values());
    }


    //selectType  multiple single
    @RequestMapping(value = {"select/{selectType}", "select"}, method = RequestMethod.GET)
    @PageableDefaults(sort = "weight=desc")
    public String select(
            Searchable searchable, Model model,
            @PathVariable(value = "selectType") String selectType,
            @MatrixVariable(value = "domId", pathVar = "selectType") String domId,
            @MatrixVariable(value = "domName", pathVar = "selectType", required = false) String domName) {

        this.permissionList.assertHasViewPermission();

        model.addAttribute("selectType", selectType);
        model.addAttribute("domId", domId);
        model.addAttribute("domName", domName);

        super.list(searchable, model);
        return "showcase/product/category/select";
    }
}
