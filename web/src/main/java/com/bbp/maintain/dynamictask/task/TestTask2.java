package com.bbp.maintain.dynamictask.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * 包名：com.bbp.maintain.dynamictask.task
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:17
 * <p>
 * 描述：
 *
 */
public class TestTask2 {

    @Autowired
    private ApplicationContext ctx;

    public void run() {
        System.out.println("====hello test task2::" + ctx);
    }
}
