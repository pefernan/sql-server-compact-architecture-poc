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

import java.util.HashMap;
import java.util.Map;
import org.kie.kogito.MapOutput;
import org.kie.kogito.UserTask;

@UserTask(taskName = "DoSomething", processName = "flow1")
public class Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        return params;
    }

    public static Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput fromMap(Map<String, Object> params) {
        org.kogito.poc.Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput result = new Flow1__70D7CFA5_5390_417B_B866_75274FF9C00A_TaskOutput();
        return result;
    }
}
//Task output for user task 'UserTask' in process 'flow1'
