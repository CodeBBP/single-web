package com.bbp.common.entity.search.exception;

import com.bbp.common.entity.search.SearchOperator;

/**
 * 包名：com.bbp.common.entity.search.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/27  23:49
 * <p>
 * 描述：
 *  
 */
public final class InvlidSearchOperatorException extends SearchException {

    public InvlidSearchOperatorException(String searchProperty, String operatorStr) {
        this(searchProperty, operatorStr, null);
    }

    public InvlidSearchOperatorException(String searchProperty, String operatorStr, Throwable cause) {
        super("Invalid Search Operator searchProperty [" + searchProperty + "], " +
                "operator [" + operatorStr + "], must be one of " + SearchOperator.toStringAllOperator(), cause);
    }
}
