package com.bbp.common.plugin.web.controller;

import com.bbp.common.entity.BaseEntity;
import com.bbp.common.entity.search.Searchable;
import com.bbp.common.plugin.entity.Movable;
import com.bbp.common.plugin.serivce.BaseMovableService;
import com.bbp.common.utils.MessageUtils;
import com.bbp.common.web.bind.annotation.PageableDefaults;
import com.bbp.common.web.controller.BaseCRUDController;
import com.bbp.common.web.validate.AjaxResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 * 包名：com.bbp.common.plugin.web.controller
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/2/28  0:30
 * <p>
 * 描述：
 *  
 */
public abstract class BaseMovableController<M extends BaseEntity & Movable, ID extends Serializable>
        extends BaseCRUDController<M, ID> {

    protected BaseMovableService<M, ID> getMovableService() {
        return (BaseMovableService<M, ID>) baseService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PageableDefaults(value = 10, sort = "weight=desc")
    @Override
    public String list(Searchable searchable, Model model) {
        return super.list(searchable, model);
    }

    @RequestMapping(value = "{fromId}/{toId}/up")
    @ResponseBody
    public AjaxResponse up(@PathVariable("fromId") ID fromId, @PathVariable("toId") ID toId) {

        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        AjaxResponse ajaxResponse = new AjaxResponse("移动位置成功");
        try {
            getMovableService().up(fromId, toId);
        } catch (IllegalStateException e) {
            ajaxResponse.setSuccess(Boolean.FALSE);
            ajaxResponse.setMessage(MessageUtils.message("move.not.enough"));
        }
        return ajaxResponse;
    }

    @RequestMapping(value = "{fromId}/{toId}/down")
    @ResponseBody
    public AjaxResponse down(@PathVariable("fromId") ID fromId, @PathVariable("toId") ID toId) {


        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        AjaxResponse ajaxResponse = new AjaxResponse("移动位置成功");
        try {
            getMovableService().down(fromId, toId);
        } catch (IllegalStateException e) {
            ajaxResponse.setSuccess(Boolean.FALSE);
            ajaxResponse.setMessage(MessageUtils.message("move.not.enough"));
        }
        return ajaxResponse;
    }

    @RequestMapping(value = "reweight")
    @ResponseBody
    public AjaxResponse reweight() {

        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        AjaxResponse ajaxResponse = new AjaxResponse("优化权重成功！");
        try {
            getMovableService().reweight();
        } catch (IllegalStateException e) {
            ajaxResponse.setSuccess(Boolean.FALSE);
            ajaxResponse.setMessage("优化权重失败了！");
        }
        return ajaxResponse;
    }

}
