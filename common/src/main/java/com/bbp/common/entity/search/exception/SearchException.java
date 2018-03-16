package com.bbp.common.entity.search.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * 包名：com.bbp.common.entity.search.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/27  23:55
 * <p>
 * 描述：
 *
 */
public class SearchException extends NestedRuntimeException {

    public SearchException(String msg) {
        super(msg);
    }

    public SearchException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
