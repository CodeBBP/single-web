/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.group.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.sys.group.entity.Group;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 包名：com.bbp.sys.group.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  17:48
 * <p>
 * 描述：
 *  
 */
public interface GroupRepository extends BaseRepository<Group, Long> {

    @Query("select id from Group where defaultGroup=true and show=true")
    List<Long> findDefaultGroupIds();

}
