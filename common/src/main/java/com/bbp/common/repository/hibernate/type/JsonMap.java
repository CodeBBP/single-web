package com.bbp.common.repository.hibernate.type;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * 包名：com.bbp.common.repository.hibernate.type
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:17
 * <p>
 * 描述：
 *
 */
public class JsonMap implements Serializable {

    private Map<Object, Object> map;

    public JsonMap() {
    }

    public JsonMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Map<Object, Object> getMap() {
        if (map == null) {
            map = Maps.newHashMap();
        }
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }
}
