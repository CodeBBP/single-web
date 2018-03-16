package com.bbp.common.entity.search.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 包名：com.bbp.common.entity.search.filter
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/27  23:55
 * <p>
 * 描述：and 条件
 *
 */
public class AndCondition implements SearchFilter {

    private List<SearchFilter> andFilters = Lists.newArrayList();

    AndCondition() {
    }

    public AndCondition add(SearchFilter filter) {
        this.andFilters.add(filter);
        return this;
    }

    public List<SearchFilter> getAndFilters() {
        return andFilters;
    }

    @Override
    public String toString() {
        return "AndCondition{" + andFilters + '}';
    }
}
