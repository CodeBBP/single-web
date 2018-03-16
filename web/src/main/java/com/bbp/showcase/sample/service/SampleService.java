/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.sample.service;

import com.bbp.common.service.BaseService;
import com.bbp.showcase.sample.entity.Sample;
import com.bbp.showcase.sample.repository.SampleRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.showcase.sample.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:30
 * <p>
 * 描述：
 *  
 */
@Service
public class SampleService extends BaseService<Sample, Long> {

    private SampleRepository getSampleRepository() {
        return (SampleRepository) baseRepository;
    }


    public Sample findByName(String name) {
        return getSampleRepository().findByName(name);
    }

}
