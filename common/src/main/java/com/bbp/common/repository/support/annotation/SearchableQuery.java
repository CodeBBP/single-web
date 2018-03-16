package com.bbp.common.repository.support.annotation;

import com.bbp.common.repository.callback.SearchCallback;

import java.lang.annotation.*;

/**
 * 包名：com.bbp.common.repository.support.annotation
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:20
 * <p>
 * 描述：覆盖默认的根据条件查询数据
 *  
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SearchableQuery {

    /**
     * 覆盖默认的查询所有ql
     *
     * @return
     */
    String findAllQuery() default "";

    /**
     * 覆盖默认的统计所有ql
     *
     * @return
     */
    String countAllQuery() default "";

    /**
     * 给ql拼条件及赋值的回调类型
     *
     * @return com.bbp.common.repository.callback.SearchCallback子类
     */
    Class<? extends SearchCallback> callbackClass() default SearchCallback.class;


    QueryJoin[] joins() default {};


}
