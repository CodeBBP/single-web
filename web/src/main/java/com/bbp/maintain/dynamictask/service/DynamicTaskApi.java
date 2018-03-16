package com.bbp.maintain.dynamictask.service;

import com.bbp.maintain.dynamictask.entity.TaskDefinition;

/**
 * 包名：com.bbp.maintain.dynamictask.service
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/13  21:16
 * <p>
 * 描述：
 *  
 */
public interface DynamicTaskApi {

    public void addTaskDefinition(TaskDefinition taskDefinition);
    public void updateTaskDefinition(TaskDefinition taskDefinition);
    public void deleteTaskDefinition(boolean forceTermination, Long... taskDefinitionIds);


    public void startTask(Long... taskDefinitionIds);
    public void stopTask(boolean forceTermination, Long... taskDefinitionId);


}
