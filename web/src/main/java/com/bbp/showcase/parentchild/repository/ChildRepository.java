/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.parentchild.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.showcase.parentchild.entity.Child;
import com.bbp.showcase.parentchild.entity.Parent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 包名：com.bbp.showcase.parentchild.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:25
 * <p>
 * 描述：
 *
 */
public interface ChildRepository extends BaseRepository<Child, Long> {

    @Query(value = "select o from Child o where o.parent=?1")
    Page<Child> findByParent(Parent parent, Pageable pageable);


    @Query(value = "select o from Child o where o.parent in(?1)")
    Page<Child> findByParents(List<Parent> parents, Pageable pageable);


    @Modifying
    @Query(value = "delete from Child where parent = ?1")
    void deleteByParent(Parent parent);
}
