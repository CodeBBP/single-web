/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.common.web.interceptor;

import com.bbp.common.web.filter.BaseFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 包名：com.bbp.common.web.interceptor
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/10  22:52
 * <p>
 * 描述：
 * <p>
 * 设置通用数据的Filter
 * <p>
 * 使用Filter时 文件上传时 getParameter时为null 所以改成Interceptor
 * <p>
 * 1、ctx---->request.contextPath
 * <p>
 * 2、currentURL---->当前地址
 */
public class SetCommonDataFilter extends BaseFilter {

    private SetCommonDataInterceptor setCommonDataInterceptor = new SetCommonDataInterceptor();

    @Override
    public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            //使用Filter时 文件上传时 getParameter时为null 所以改成Interceptor
            setCommonDataInterceptor.preHandle(request, response, null);
        } catch (Exception e) {
            throw new ServletException(e);
        }
        chain.doFilter(request, response);
    }
}
