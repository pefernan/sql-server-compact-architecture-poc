package org.kogito.poc;

import org.kogito.poc.Flow2Model;

public class Flow2ProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Flow2Model> {

    public Flow2ProcessInstance(org.kogito.poc.Flow2Process process, Flow2Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Flow2ProcessInstance(org.kogito.poc.Flow2Process process, Flow2Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Flow2ProcessInstance(org.kogito.poc.Flow2Process process, Flow2Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Flow2ProcessInstance(org.kogito.poc.Flow2Process process, Flow2Model value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Flow2ProcessInstance(org.kogito.poc.Flow2Process process, Flow2Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Flow2Model variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Flow2Model variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
