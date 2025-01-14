package org.kogito.poc;

import org.kogito.poc.NewflowModel;

public class NewflowProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<NewflowModel> {

    public NewflowProcessInstance(org.kogito.poc.NewflowProcess process, NewflowModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public NewflowProcessInstance(org.kogito.poc.NewflowProcess process, NewflowModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public NewflowProcessInstance(org.kogito.poc.NewflowProcess process, NewflowModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public NewflowProcessInstance(org.kogito.poc.NewflowProcess process, NewflowModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public NewflowProcessInstance(org.kogito.poc.NewflowProcess process, NewflowModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(NewflowModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(NewflowModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
