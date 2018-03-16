/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.parentchild.service;

import com.bbp.common.service.BaseService;
import com.bbp.showcase.parentchild.entity.Child;
import com.bbp.showcase.parentchild.entity.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包名：com.bbp.showcase.parentchild.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:26
 * <p>
 * 描述：
 *
 */
@Service
public class ParentService extends BaseService<Parent, Long> {

    @Autowired
    private ChildService childService;


    public void save(Parent parent, List<Child> childList) {
        save(parent);
        saveOrUpdateChild(parent, childList);
    }

    public void update(Parent parent, List<Child> childList) {
        update(parent);
        saveOrUpdateChild(parent, childList);
    }

    private void saveOrUpdateChild(Parent parent, List<Child> childList) {
        for (Child child : childList) {
            if (child == null) {//防止中间有跳过的
                continue;
            }
            child.setParent(parent);
            if (child.getId() == null) {//新的
                childService.save(child);
            } else {
                childService.update(child);
            }
        }
    }
}
