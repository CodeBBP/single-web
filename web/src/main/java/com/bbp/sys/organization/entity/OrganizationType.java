package com.bbp.sys.organization.entity;

/**
 * 包名：com.bbp.sys.organization.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:42
 * <p>
 * 描述：组织机构类型
 *
 */
public enum OrganizationType {
    bloc("集团"), branch_office("分公司"), department("部门"), group("部门小组");

    private final String info;

    private OrganizationType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
