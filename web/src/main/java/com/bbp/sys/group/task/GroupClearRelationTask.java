/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.group.task;

import com.bbp.sys.group.repository.GroupRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包名：com.bbp.sys.group.task
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:39
 * <p>
 * 描述：
 * 清理无关联的关系
 * 1、Group-GroupRelation
 * 2、GroupRelation-User
 * 3、GroupRelation-Organization
 * 4、GroupRelation-Job  
 */
@Service
public class GroupClearRelationTask {

    @Autowired
    private GroupRelationRepository groupRelationRepository;

    /**
     * 清除删除的分组对应的关系
     */
    public void clearDeletedGroupRelation() {
        groupRelationRepository.clearDeletedGroupRelation();
    }

}
