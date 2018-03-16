/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.deleted.service;

import com.bbp.common.service.BaseService;
import com.bbp.showcase.deleted.entity.DeletedSample;
import com.bbp.showcase.deleted.repository.DeletedSampleRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.showcase.deleted.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:52
 * <p>
 * 描述：
 *
 */
@Service
public class DeletedSampleService extends BaseService<DeletedSample, Long> {

    private DeletedSampleRepository getSampleRepository() {
        return (DeletedSampleRepository) baseRepository;
    }

    public DeletedSample findByName(String name) {
        return getSampleRepository().findByName(name);
    }

}
