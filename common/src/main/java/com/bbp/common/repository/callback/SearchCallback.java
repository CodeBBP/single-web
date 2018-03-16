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
public interface SearchCallback {

    public static final SearchCallback NONE = new NoneSearchCallback();
    public static final SearchCallback DEFAULT = new DefaultSearchCallback();


    /**
     * 动态拼HQL where、group by having
     *
     * @param ql
     * @param search
     */
    public void prepareQL(StringBuilder ql, Searchable search);

    public void prepareOrder(StringBuilder ql, Searchable search);

    /**
     * 根据search给query赋值及设置分页信息
     *
     * @param query
     * @param search
     */
    public void setValues(Query query, Searchable search);

    public void setPageable(Query query, Searchable search);

}
