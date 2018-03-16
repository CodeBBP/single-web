/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.parentchild.service;

import com.bbp.common.service.BaseService;
import com.bbp.showcase.parentchild.entity.Child;
import com.bbp.showcase.parentchild.entity.Parent;
import com.bbp.showcase.parentchild.repository.ChildRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包名：com.bbp.showcase.parentchild.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:25
 * <p>
 * 描述：
 *  
 */
@Service
public class ChildService extends BaseService<Child, Long> {

    private ChildRepository getChildRepository() {
        return (ChildRepository) baseRepository;
    }


    public ChildService() {
    }

    public Page<Child> findByParent(Parent parent, Pageable pageable) {
        return getChildRepository().findByParent(parent, pageable);
    }

    Page<Child> findByParents(List<Parent> parents, Pageable pageable) {
        return getChildRepository().findByParents(parents, pageable);
    }


    public void deleteByParent(Parent parent) {
        getChildRepository().deleteByParent(parent);
    }
}
