/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kogito.poc;

import org.kie.kogito.process.workitem.TaskModel;

public class Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskModel implements TaskModel<org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskInput, org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput> {

    private String id;

    private String name;

    private int state;

    private String phase;

    private String phaseStatus;

    private org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskInput parameters;

    private org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput results;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskInput getParameters() {
        return parameters;
    }

    public void setParameters(org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskInput parameters) {
        this.parameters = parameters;
    }

    public org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput getResults() {
        return results;
    }

    public void setParams(org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput results) {
        this.results = results;
    }

    public static org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskModel from(org.kie.kogito.process.WorkItem workItem) {
        org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskModel taskModel = new org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskModel();
        taskModel.id = workItem.getId();
        taskModel.name = workItem.getName();
        taskModel.state = workItem.getState();
        taskModel.phaseStatus = workItem.getPhaseStatus();
        taskModel.phase = workItem.getPhase();
        taskModel.parameters = org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskInput.fromMap(workItem.getParameters());
        taskModel.results = org.kogito.poc.Flow2__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput.fromMap(workItem.getResults());
        return taskModel;
    }
}
//Task model for user task 'UserTask' in process 'flow2'
