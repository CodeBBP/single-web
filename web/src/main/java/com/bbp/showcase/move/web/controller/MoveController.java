/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.move.web.controller;

import com.bbp.common.entity.enums.BooleanEnum;
import com.bbp.common.entity.validate.group.Create;
import com.bbp.common.plugin.web.controller.BaseMovableController;
import com.bbp.showcase.move.entity.Move;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * 包名：com.bbp.showcase.move.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:22
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/showcase/move")
public class MoveController extends BaseMovableController<Move, Long> {


    public MoveController() {
        setResourceIdentity("showcase:move");
    }

    @Override
    public void setCommonData(Model model) {
        model.addAttribute("booleanList", BooleanEnum.values());
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    @Override
    public String create(Model model,
                         //表示只验证Create.class分组
                         @Validated(value = Create.class) @Valid Move move, BindingResult result,
                         RedirectAttributes redirectAttributes) {
        return super.create(model, move, result, redirectAttributes);
    }

}
