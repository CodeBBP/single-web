/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.service;

import com.bbp.common.service.BaseService;
import com.bbp.sys.user.entity.UserLastOnline;
import com.bbp.sys.user.repository.UserLastOnlineRepository;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.sys.user.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  20:50
 * <p>
 * 描述：
 *  
 */
@Service
public class UserLastOnlineService extends BaseService<UserLastOnline, Long> {

    private UserLastOnlineRepository getUserLastOnlineRepository() {
        return (UserLastOnlineRepository) baseRepository;
    }


    public UserLastOnline findByUserId(Long userId) {
        return getUserLastOnlineRepository().findByUserId(userId);
    }

    public void lastOnline(UserLastOnline lastOnline) {
        UserLastOnline dbLastOnline = findByUserId(lastOnline.getUserId());

        if (dbLastOnline == null) {
            dbLastOnline = lastOnline;
        } else {
            UserLastOnline.merge(lastOnline, dbLastOnline);
        }
        dbLastOnline.incLoginCount();
        dbLastOnline.incTotalOnlineTime();
        //相对于save or update
        save(dbLastOnline);
    }
}
