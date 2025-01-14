package org.kogito.poc;

import org.kogito.poc.NewflowModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("newflow")
@io.quarkus.runtime.Startup()
public class NewflowProcess extends org.kie.kogito.process.impl.AbstractProcess<org.kogito.poc.NewflowModel> {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("flow1")
    org.kie.kogito.process.Process<Flow1Model> processflow1;

    @jakarta.inject.Inject()
    @jakarta.inject.Named("flow2")
    org.kie.kogito.process.Process<Flow2Model> processflow2;

    @jakarta.inject.Inject()
    @jakarta.inject.Named("flow3")
    org.kie.kogito.process.Process<Flow3Model> processflow3;

    @jakarta.inject.Inject()
    public NewflowProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public NewflowProcess() {
    }

    @Override()
    public org.kogito.poc.NewflowProcessInstance createInstance(org.kogito.poc.NewflowModel value) {
        return new org.kogito.poc.NewflowProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.kogito.poc.NewflowProcessInstance createInstance(java.lang.String businessKey, org.kogito.poc.NewflowModel value) {
        return new org.kogito.poc.NewflowProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.kogito.poc.NewflowProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.kogito.poc.NewflowModel value) {
        return new org.kogito.poc.NewflowProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.kogito.poc.NewflowModel createModel() {
        return new org.kogito.poc.NewflowModel();
    }

    public org.kogito.poc.NewflowProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.kogito.poc.NewflowModel) value);
    }

    public org.kogito.poc.NewflowProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.kogito.poc.NewflowModel) value);
    }

    public org.kogito.poc.NewflowProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kogito.poc.NewflowProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.kogito.poc.NewflowProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kogito.poc.NewflowProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("newflow", true);
        factory.name("newflow");
        factory.packageName("org.kogito.poc");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81 = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B45422B2-F0D4-40D2-A2BF-72BE1F23EC81"));
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.name("Flow1");
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.processId("flow1");
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.processName("");
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.waitForCompletion(true);
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.independent(false);
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<Flow1Model>() {

            public Flow1Model bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.kogito.poc.Flow1Model model = new org.kogito.poc.Flow1Model();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<Flow1Model> createInstance(Flow1Model model) {
                return (org.kie.kogito.process.ProcessInstance<Flow1Model>) app.get(org.kie.kogito.process.Processes.class).processById("flow1").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, Flow1Model model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("UniqueId", "_B45422B2-F0D4-40D2-A2BF-72BE1F23EC81");
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("elementname", "Flow1");
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("x", 220);
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("width", 154);
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("y", 172);
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("customAbortParent", "false");
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.metaData("height", 102);
        subProcessNode_B45422B2_F0D4_40D2_A2BF_72BE1F23EC81.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1 = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3E1D8CDA-AE26-40AC-9649-51D35528A7F1"));
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.name("Flow2");
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.processId("flow2");
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.processName("");
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.waitForCompletion(true);
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.independent(false);
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<Flow2Model>() {

            public Flow2Model bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.kogito.poc.Flow2Model model = new org.kogito.poc.Flow2Model();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<Flow2Model> createInstance(Flow2Model model) {
                return (org.kie.kogito.process.ProcessInstance<Flow2Model>) app.get(org.kie.kogito.process.Processes.class).processById("flow2").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, Flow2Model model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("UniqueId", "_3E1D8CDA-AE26-40AC-9649-51D35528A7F1");
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("elementname", "Flow2");
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("x", 495);
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("width", 154);
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("y", 171);
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("customAbortParent", "false");
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.metaData("height", 102);
        subProcessNode_3E1D8CDA_AE26_40AC_9649_51D35528A7F1.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_78AD0E36-AF72-4098-BBA2-BD042B17A13B"));
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.name("Flow3");
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.processId("flow3");
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.processName("");
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.waitForCompletion(true);
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.independent(false);
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<Flow3Model>() {

            public Flow3Model bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.kogito.poc.Flow3Model model = new org.kogito.poc.Flow3Model();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<Flow3Model> createInstance(Flow3Model model) {
                return (org.kie.kogito.process.ProcessInstance<Flow3Model>) app.get(org.kie.kogito.process.Processes.class).processById("flow3").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, Flow3Model model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("UniqueId", "_78AD0E36-AF72-4098-BBA2-BD042B17A13B");
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("elementname", "Flow3");
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("x", 776);
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("width", 154);
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("y", 166);
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("customAbortParent", "false");
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.metaData("height", 102);
        subProcessNode_78AD0E36_AF72_4098_BBA2_BD042B17A13B.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_15A6A6A0-81C3-458B-9D37-56FB4AAF2908"));
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.name("Start");
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.interrupting(false);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("UniqueId", "_15A6A6A0-81C3-458B-9D37-56FB4AAF2908");
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("EventType", "none");
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("x", 64);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("width", 56);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("y", 194);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("height", 56);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A0EB9532-1C40-4B17-82CB-5E417D384A74"));
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.name("End");
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.terminate(false);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("UniqueId", "_A0EB9532-1C40-4B17-82CB-5E417D384A74");
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("x", 1057);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("width", 56);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("y", 189);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("height", 56);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_15A6A6A0-81C3-458B-9D37-56FB4AAF2908"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B45422B2-F0D4-40D2-A2BF-72BE1F23EC81"), "_781101E9-E5B4-419B-8E03-19C8A2430874");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B45422B2-F0D4-40D2-A2BF-72BE1F23EC81"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3E1D8CDA-AE26-40AC-9649-51D35528A7F1"), "_E49B5326-8777-44F0-8935-ECC726C7A148");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3E1D8CDA-AE26-40AC-9649-51D35528A7F1"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_78AD0E36-AF72-4098-BBA2-BD042B17A13B"), "_C58ABDB9-E613-4465-AEE9-39CCDBFAE906");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_78AD0E36-AF72-4098-BBA2-BD042B17A13B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A0EB9532-1C40-4B17-82CB-5E417D384A74"), "_9CA5ECFF-54A6-45BE-AE80-F5D1D3C33B32");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("flow1", completionEventListener);
        services.getSignalManager().addEventListener("flow2", completionEventListener);
        services.getSignalManager().addEventListener("flow3", completionEventListener);
    }
}
