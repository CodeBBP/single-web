package com.bbp.common.entity.search.exception;

/**
 * 包名：com.bbp.common.entity.search.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/27  23:52
 * <p>
 * 描述：
 *  
 */
public final class InvalidSearchValueException extends SearchException {

    public InvalidSearchValueException(String searchProperty, String entityProperty, Object value) {
        this(searchProperty, entityProperty, value, null);
    }

    public InvalidSearchValueException(String searchProperty, String entityProperty, Object value, Throwable cause) {
        super("Invalid Search Value, searchProperty [" + searchProperty + "], " +
                "entityProperty [" + entityProperty + "], value [" + value + "]", cause);
    }

}
