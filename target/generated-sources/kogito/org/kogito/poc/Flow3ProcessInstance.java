package org.kogito.poc;

import org.kogito.poc.Flow3Model;

public class Flow3ProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Flow3Model> {

    public Flow3ProcessInstance(org.kogito.poc.Flow3Process process, Flow3Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Flow3ProcessInstance(org.kogito.poc.Flow3Process process, Flow3Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Flow3ProcessInstance(org.kogito.poc.Flow3Process process, Flow3Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Flow3ProcessInstance(org.kogito.poc.Flow3Process process, Flow3Model value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Flow3ProcessInstance(org.kogito.poc.Flow3Process process, Flow3Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Flow3Model variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Flow3Model variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
