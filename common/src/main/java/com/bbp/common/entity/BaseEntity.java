package com.bbp.common.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 包名：com.bbp.common.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:09
 * <p>
 * 描述：抽象实体基类，提供统一的ID，和相关的基本功能方法，如果是oracle请参考{@link BaseOracleEntity}
 */
@MappedSuperclass
public abstract class BaseEntity<ID extends Serializable> extends AbstractEntity<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {
        this.id = id;
    }

}
