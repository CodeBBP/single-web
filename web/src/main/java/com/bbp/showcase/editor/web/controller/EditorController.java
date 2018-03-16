/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.editor.web.controller;

import com.bbp.common.web.controller.BaseCRUDController;
import com.bbp.showcase.editor.entity.Editor;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 包名：com.bbp.showcase.editor.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:54
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/showcase/editor")
public class EditorController extends BaseCRUDController<Editor, Long> {

    public EditorController() {
        setResourceIdentity("showcase:editor");
    }

    /**
     * 验证失败返回true
     *
     * @param m
     * @param result
     * @return
     */
    @Override
    protected boolean hasError(Editor m, BindingResult result) {
        Assert.notNull(m);

        return result.hasErrors();
    }


}
