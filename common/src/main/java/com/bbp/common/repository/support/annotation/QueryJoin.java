package com.bbp.common.repository.support.annotation;

import javax.persistence.criteria.JoinType;
import java.lang.annotation.*;

/**
 * 包名：com.bbp.common.repository.support.annotation
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:20
 * <p>
 * 描述：
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QueryJoin {

    /**
     * 连接的名字
     * @return
     */
    String property();

    JoinType joinType();

}
