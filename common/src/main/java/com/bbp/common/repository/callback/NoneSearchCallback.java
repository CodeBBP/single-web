package com.bbp.common.repository.callback;

import com.bbp.common.entity.search.Searchable;

import javax.persistence.Query;

/**
 * 包名：com.bbp.common.repository.callback
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:16
 * <p>
 * 描述：
 *
 */
public final class NoneSearchCallback implements SearchCallback {

    @Override
    public void prepareQL(StringBuilder ql, Searchable search) {
    }

    @Override
    public void prepareOrder(StringBuilder ql, Searchable search) {
    }

    @Override
    public void setValues(Query query, Searchable search) {
    }

    @Override
    public void setPageable(Query query, Searchable search) {
    }
}
