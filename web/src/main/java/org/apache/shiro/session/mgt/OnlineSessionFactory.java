/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package org.apache.shiro.session.mgt;

import com.bbp.common.utils.IpUtils;
import com.bbp.sys.user.entity.UserOnline;
import org.apache.shiro.session.Session;
import org.apache.shiro.web.session.mgt.WebSessionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 包名：org.apache.shiro.session.mgt
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  19:08
 * <p>
 * 描述：<p>
 * 创建自定义的session，添加一些自定义的数据。
 * <p>
 * 如 用户登录到的系统ip、用户状态（在线 隐身 强制退出）等、比如当前所在系统等
 */
public class OnlineSessionFactory implements SessionFactory {

    @Override
    public Session createSession(SessionContext initData) {
        OnlineSession session = new OnlineSession();
        if (initData != null && initData instanceof WebSessionContext) {
            WebSessionContext sessionContext = (WebSessionContext) initData;
            HttpServletRequest request = (HttpServletRequest) sessionContext.getServletRequest();
            if (request != null) {
                session.setHost(IpUtils.getIpAddr(request));
                session.setUserAgent(request.getHeader("User-Agent"));
                session.setSystemHost(request.getLocalAddr() + ":" + request.getLocalPort());
            }
        }
        return session;
    }

    public Session createSession(UserOnline userOnline) {
        return userOnline.getSession();
    }
}
