/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.deleted.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.showcase.deleted.entity.DeletedSample;

/**
 * 包名：com.bbp.showcase.deleted.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:52
 * <p>
 * 描述：
 *
 */
public interface DeletedSampleRepository extends BaseRepository<DeletedSample, Long> {

    DeletedSample findByName(String name);

}
