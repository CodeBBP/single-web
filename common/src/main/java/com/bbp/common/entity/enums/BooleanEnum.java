package com.bbp.common.entity.enums;

/**
 * 包名：com.bbp.common.entity.enums
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/27  23:55
 * <p>
 * 描述：
 *  
 */
public enum BooleanEnum {
    TRUE(Boolean.TRUE, "是"), FALSE(Boolean.FALSE, "否");

    private final Boolean value;
    private final String info;

    private BooleanEnum(Boolean value, String info) {
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
