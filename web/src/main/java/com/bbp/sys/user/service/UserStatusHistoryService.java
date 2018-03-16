/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.service;

import com.bbp.common.entity.search.Searchable;
import com.bbp.common.service.BaseService;
import com.bbp.sys.user.entity.User;
import com.bbp.sys.user.entity.UserStatus;
import com.bbp.sys.user.entity.UserStatusHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

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
public class UserStatusHistoryService extends BaseService<UserStatusHistory, Long> {

    public void log(User opUser, User user, UserStatus newStatus, String reason) {
        UserStatusHistory history = new UserStatusHistory();
        history.setUser(user);
        history.setOpUser(opUser);
        history.setOpDate(new Date());
        history.setStatus(newStatus);
        history.setReason(reason);
        save(history);
    }

    public UserStatusHistory findLastHistory(final User user) {
        Searchable searchable = Searchable.newSearchable()
                .addSearchParam("user_eq", user)
                .addSort(Sort.Direction.DESC, "opDate")
                .setPage(0, 1);

        Page<UserStatusHistory> page = baseRepository.findAll(searchable);

        if (page.hasContent()) {
            return page.getContent().get(0);
        }
        return null;
    }

    public String getLastReason(User user) {
        UserStatusHistory history = findLastHistory(user);
        if (history == null) {
            return "";
        }
        return history.getReason();
    }
}
