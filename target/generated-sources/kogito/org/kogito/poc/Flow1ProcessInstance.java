package org.kogito.poc;

import org.kogito.poc.Flow1Model;

public class Flow1ProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Flow1Model> {

    public Flow1ProcessInstance(org.kogito.poc.Flow1Process process, Flow1Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Flow1ProcessInstance(org.kogito.poc.Flow1Process process, Flow1Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Flow1ProcessInstance(org.kogito.poc.Flow1Process process, Flow1Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Flow1ProcessInstance(org.kogito.poc.Flow1Process process, Flow1Model value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Flow1ProcessInstance(org.kogito.poc.Flow1Process process, Flow1Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Flow1Model variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Flow1Model variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
