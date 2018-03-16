package com.bbp.common.plugin.web.controller.entity;

import java.io.Serializable;

/**
 * 包名：com.bbp.common.plugin.web.controller.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:30
 * <p>
 * 描述： ztree类
 *
 */
public class ZTree<ID extends Serializable> implements Serializable {
    private ID id;
    private ID pId;
    private String name;
    private String iconSkin;
    private boolean open;
    private boolean root;
    private boolean isParent;
    private boolean nocheck = false;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public ID getpId() {
        return pId;
    }

    public void setpId(ID pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconSkin() {
        return iconSkin;
    }

    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }


    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    public boolean isIsParent() {
        return isParent;
    }

    public void setIsParent(boolean isParent) {
        this.isParent = isParent;
    }

    public boolean isNocheck() {
        return nocheck;
    }

    public void setNocheck(boolean nocheck) {
        this.nocheck = nocheck;
    }

}
