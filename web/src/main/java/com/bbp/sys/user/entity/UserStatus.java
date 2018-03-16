package com.bbp.sys.user.entity;

/**
 * 包名：com.bbp.sys.user.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:52
 * <p>
 * 描述：
 *
 */
public enum UserStatus {

    normal("正常状态"), blocked("封禁状态");

    private final String info;

    private UserStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
