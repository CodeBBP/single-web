package com.bbp.showcase.parentchild.entity;

/**
 * 包名：com.bbp.showcase.parentchild.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:24
 * <p>
 * 描述：父子表测试使用的enum
 *
 */
public enum ParentChildType {
    type1("测试类型1"), type2("测试类型2");

    private final String info;

    private ParentChildType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
