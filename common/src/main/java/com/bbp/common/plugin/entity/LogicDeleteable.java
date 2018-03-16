package com.bbp.common.plugin.entity;

/**
 * 包名：com.bbp.common.plugin.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:13
 * <p>
 * 描述：<p>
 * 实体实现该接口表示想要逻辑删除<p>
 *
 * 为了简化开发 约定删除标识列名为deleted，如果想自定义删除的标识列名：<p>
 * 1、使用注解元数据<p>
 * 2、写一个 getColumn() 方法 返回列名<p>
 *
 */
public interface LogicDeleteable {

    public Boolean getDeleted();

    public void setDeleted(Boolean deleted);

    /**
     * 标识为已删除
     */
    public void markDeleted();

}
