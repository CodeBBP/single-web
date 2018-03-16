/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.common.plugin.entity;

/**
 * 包名：com.bbp.common.plugin.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:13
 * <p>
 * 描述：<p>
 * 实体实现该接口表示想要调整数据的顺序<p>
 * 优先级值越大则展示时顺序越靠前 比如 2 排在 1 前边
 *
 */
public interface Movable {

    public Integer getWeight();

    public void setWeight(Integer weight);

}
