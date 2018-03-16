package com.bbp.common.utils;

import org.springframework.context.MessageSource;

/**
 * 包名：com.bbp.common.utils
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:04
 * <p>
 * 描述：
 *
 */
public class MessageUtils {

    private static MessageSource messageSource;

    /**
     * 根据消息键和参数 获取消息
     * 委托给spring messageSource
     *
     * @param code 消息键
     * @param args 参数
     * @return
     */
    public static String message(String code, Object... args) {
        if (messageSource == null) {
            messageSource = SpringUtils.getBean(MessageSource.class);
        }
        return messageSource.getMessage(code, args, null);
    }

}
