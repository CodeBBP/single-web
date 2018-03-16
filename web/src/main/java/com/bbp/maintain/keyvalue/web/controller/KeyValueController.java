/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.keyvalue.web.controller;

import com.bbp.common.web.controller.BaseCRUDController;
import com.bbp.common.web.validate.ValidateResponse;
import com.bbp.maintain.keyvalue.entity.KeyValue;
import com.bbp.maintain.keyvalue.service.KeyValueService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 包名：com.bbp.maintain.keyvalue.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:23
 * <p>
 * 描述：
 *
 */
@Controller
@RequestMapping(value = "/admin/maintain/keyvalue")
public class KeyValueController extends BaseCRUDController<KeyValue, Long> {

    private KeyValueService getKeyValueService() {
        return (KeyValueService) baseService;
    }

    public KeyValueController() {
        setResourceIdentity("maintain:icon");
    }


    /**
     * 验证返回格式
     * 单个：[fieldId, 1|0, msg]
     * 多个：[[fieldId, 1|0, msg],[fieldId, 1|0, msg]]
     *
     * @param fieldId
     * @param fieldValue
     * @return
     */
    @RequestMapping(value = "validate", method = RequestMethod.GET)
    @ResponseBody
    public Object validate(
            @RequestParam("fieldId") String fieldId, @RequestParam("fieldValue") String fieldValue,
            @RequestParam(value = "id", required = false) Long id) {
        ValidateResponse response = ValidateResponse.newInstance();

        if ("key".equals(fieldId)) {
            KeyValue keyValue = getKeyValueService().findByKey(fieldValue);
            if (keyValue == null || (keyValue.getId().equals(id) && keyValue.getKey().equals(fieldValue))) {
                //如果msg 不为空 将弹出提示框
                response.validateSuccess(fieldId, "");
            } else {
                response.validateFail(fieldId, "该键已被使用");
            }
        }
        return response.result();
    }


}
