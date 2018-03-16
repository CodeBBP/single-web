package com.bbp.common.repository.support.annotation;

import java.lang.annotation.*;

/**
 * 包名：com.bbp.common.repository.support.annotation
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:19
 * <p>
 * 描述：开启查询缓存
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableQueryCache {

    boolean value() default true;

}
