/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.showcase.excel.repository;

import com.bbp.common.repository.BaseRepository;
import com.bbp.showcase.excel.entity.ExcelData;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 包名：com.bbp.showcase.excel.repository
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  8:55
 * <p>
 * 描述：
 *
 */
public interface ExcelDataRepository extends BaseRepository<ExcelData, Long> {

    public void truncate();

    @Modifying
    @Query(value = "insert into showcase_excel_data (id, content) values(?1,?2)", nativeQuery = true)
    public void save(Long id, String content);

}
