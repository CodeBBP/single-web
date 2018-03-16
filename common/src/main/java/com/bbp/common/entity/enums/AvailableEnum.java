package com.bbp.common.entity.enums;

/**
 * 包名：com.bbp.common.entity.enums
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/27  23:48
 * <p>
 * 描述：
 *
 */
public enum AvailableEnum {
    TRUE(Boolean.TRUE, "可用"), FALSE(Boolean.FALSE, "不可用");

    private final Boolean value;
    private final String info;

    private AvailableEnum(Boolean value, String info) {
        this.value = value;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public Boolean getValue() {
        return value;
    }
}
