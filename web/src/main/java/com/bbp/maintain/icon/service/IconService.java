/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.maintain.icon.service;

import com.bbp.common.service.BaseService;
import com.bbp.maintain.icon.entity.Icon;
import com.bbp.maintain.icon.repository.IconRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.maintain.icon.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:19
 * <p>
 * 描述：
 *
 */
@Service
public class IconService extends BaseService<Icon, Long> {

    private IconRepository getIconRepository() {
        return (IconRepository) baseRepository;
    }

    public Icon findByIdentity(String identity) {
        return getIconRepository().findByIdentity(identity);
    }
}
