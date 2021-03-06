/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.sys.user.entity;

import com.bbp.common.entity.BaseEntity;
import com.bbp.common.repository.support.annotation.EnableQueryCache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

/**
 * 包名：com.bbp.sys.user.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:52
 * <p>
 * 描述：
 * 为了提高连表性能 使用数据冗余 而不是 组织机构(1)-----(*)职务的中间表
 * 即在该表中 用户--组织机构--职务 是唯一的  但 用户-组织机构可能重复  
 */
@Entity
@Table(name = "sys_user_organization_job")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserOrganizationJob extends BaseEntity<Long> {

    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @Basic(optional = true, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    private User user;

    @Column(name = "organization_id")
    private Long organizationId;

    @Column(name = "job_id")
    private Long jobId;


    public UserOrganizationJob() {
    }

    public UserOrganizationJob(Long id) {
        setId(id);
    }

    public UserOrganizationJob(Long organizationId, Long jobId) {
        this.organizationId = organizationId;
        this.jobId = jobId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    @Override
    public String toString() {
        return "UserOrganizationJob{id = " + this.getId() +
                ",organizationId=" + organizationId +
                ", jobId=" + jobId +
                ", userId=" + (user != null ? user.getId() : "null") +
                '}';
    }
}
