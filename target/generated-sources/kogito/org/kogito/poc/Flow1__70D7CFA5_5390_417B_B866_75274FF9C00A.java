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

import java.util.Set;
import org.kie.kogito.Application;
import org.kie.kogito.usertask.UserTask;
import org.kie.kogito.usertask.UserTaskAssignmentStrategy;
import org.kie.kogito.usertask.UserTaskConfig;
import org.kie.kogito.usertask.UserTaskInstances;
import org.kie.kogito.usertask.impl.DefaultUserTask;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A")
public class Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A extends DefaultUserTask {

    @jakarta.inject.Inject
    Application application;

    public Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A() {
        super("_70D7CFA5-5390-417B-B866-75274FF9C00A", "DoSomething");
        this.setPotentialUsers((java.lang.String) null);
        this.setPotentialGroups((java.lang.String) null);
        this.setAdminUsers((java.lang.String) null);
        this.setAdminGroups((java.lang.String) null);
        this.setExcludedUsers((java.lang.String) null);
        this.setTaskDescription((java.lang.String) null);
        this.setTaskPriority((java.lang.String) null);
        this.setReferenceName("UserTask");
        this.setSkippable("false");
        this.setNotStartedDeadLines((java.lang.String) null);
        this.setNotCompletedDeadlines((java.lang.String) null);
        this.setNotStartedReassignments((java.lang.String) null);
        this.setNotCompletedReassignments((java.lang.String) null);
    }

    @Override
    public UserTaskAssignmentStrategy getAssignmentStrategy() {
        UserTaskConfig userTaskConfig = application.config().get(UserTaskConfig.class);
        return userTaskConfig.userTaskAssignmentStrategies().defaultUserTaskAssignmentStrategy();
    }

    @Override
    public UserTaskInstances instances() {
        UserTaskConfig userTaskConfig = application.config().get(UserTaskConfig.class);
        return userTaskConfig.userTaskInstances();
    }
}
