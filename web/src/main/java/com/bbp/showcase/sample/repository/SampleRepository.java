/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.sample.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.showcase.sample.entity.Sample;

/**
 * 包名：com.bbp.showcase.sample.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:30
 * <p>
 * 描述：
 *  
 */
public interface SampleRepository extends BaseRepository<Sample, Long> {

    Sample findByName(String name);

}
