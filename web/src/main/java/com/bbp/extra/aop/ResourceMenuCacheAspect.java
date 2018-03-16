/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.extra.aop;

import com.bbp.common.cache.BaseCacheAspect;
import com.bbp.sys.user.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 包名：com.bbp.extra.aop
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:50
 * <p>
 * 描述：缓存及清理菜单缓存
 *
 */
@Component
@Aspect
public class ResourceMenuCacheAspect extends BaseCacheAspect {

    public ResourceMenuCacheAspect() {
        setCacheName("sys-menuCache");
    }

    private String menusKeyPrefix = "menus-";

    /**
     * 使用“target(类型全限定名)”匹配当前目标对象类型的执行方法；
     * 【注意】
     * 1、是目标对象的类型匹配，这样就不包括引入接口也类型匹配；
     * 2、注意target中使用的表达式必须是  类型全限定名，不支持通配符；
     *
     * 当前切入点（目标对象）是 com.bbp.sys.resource.service.ResourceService 的任何方法
     */
    @Pointcut(value = "target(com.bbp.sys.resource.service.ResourceService)")
    private void resourceServicePointcut() {
    }

    /**
     * 当前切入点（目标对象）是 任意包下任意参数的 save 或者 update 或者 delete 方法
     */
    @Pointcut(value = "execution(* save(..)) || execution(* update(..)) || execution(* delete(..))")
    private void resourceCacheEvictAllPointcut() {
    }

    /**
     * 当前切入点（目标对象）是 任意包下只有一个参数且传入参数类型为User同时传入参数名是user的findMenus方法
     */
    @Pointcut(value = "execution(* findMenus(*)) && args(arg)", argNames = "arg")
    private void resourceCacheablePointcut(User arg) {
    }

    @Before(value = "resourceServicePointcut() && resourceCacheEvictAllPointcut()")
    public void findRolesCacheableAdvice() throws Throwable {
        clear();
    }

    @Around(value = "resourceServicePointcut() && resourceCacheablePointcut(arg)", argNames = "pjp,arg")
    public Object findRolesCacheableAdvice(ProceedingJoinPoint pjp, User arg) throws Throwable {

        User user = arg;

        String key = menusKey(user.getId());
        Object retVal = get(key);

        if (retVal != null) {
            log.debug("cacheName:{}, method:findRolesCacheableAdvice, hit key:{}", cacheName, key);
            return retVal;
        }
        log.debug("cacheName:{}, method:findRolesCacheableAdvice, miss key:{}", cacheName, key);

        retVal = pjp.proceed();

        put(key, retVal);

        return retVal;
    }


    public void evict(Long userId) {
        evict(menusKey(userId));
    }


    private String menusKey(Long userId) {
        return this.menusKeyPrefix + userId;
    }


}
