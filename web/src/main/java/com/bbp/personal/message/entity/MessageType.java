package com.bbp.personal.message.entity;

/**
 * 包名：com.bbp.personal.message.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  14:38
 * <p>
 * 描述：消息类型
 *
 */
public enum MessageType {
    user_message("普通消息"),
    system_message("系统消息");

    private final String info;

    private MessageType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    

}
