/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.keyvalue.service;

import com.bbp.common.service.BaseService;
import com.bbp.maintain.keyvalue.entity.KeyValue;
import com.bbp.maintain.keyvalue.repository.KeyValueRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.maintain.keyvalue.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:23
 * <p>
 * 描述：
 *  
 */
@Service
public class KeyValueService extends BaseService<KeyValue, Long> {

    private KeyValueRepository getKeyValueRepository() {
        return (KeyValueRepository) baseRepository;
    }


    public KeyValue findByKey(String key) {
        return getKeyValueRepository().findByKey(key);
    }

}
