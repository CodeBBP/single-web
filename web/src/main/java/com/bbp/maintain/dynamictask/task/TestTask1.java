package com.bbp.maintain.dynamictask.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

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
@Service("testTask1")
public class TestTask1 {

    @Autowired
    private ApplicationContext ctx;

    public void run() {
        System.out.println("====hello test task1::" + ctx);
    }
}
