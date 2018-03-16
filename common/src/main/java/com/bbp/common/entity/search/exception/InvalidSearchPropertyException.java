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
public final class InvalidSearchPropertyException extends SearchException {

    public InvalidSearchPropertyException(String searchProperty, String entityProperty) {
        this(searchProperty, entityProperty, null);
    }

    public InvalidSearchPropertyException(String searchProperty, String entityProperty, Throwable cause) {
        super("Invalid Search Property [" + searchProperty + "] Entity Property [" + entityProperty + "]", cause);
    }


}
