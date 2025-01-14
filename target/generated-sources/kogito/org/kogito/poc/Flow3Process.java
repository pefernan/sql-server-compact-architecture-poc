package org.kogito.poc;

import org.kogito.poc.Flow3Model;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("flow3")
@io.quarkus.runtime.Startup()
public class Flow3Process extends org.kie.kogito.process.impl.AbstractProcess<org.kogito.poc.Flow3Model> {

    @jakarta.inject.Inject()
    public Flow3Process(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public Flow3Process() {
    }

    @Override()
    public org.kogito.poc.Flow3ProcessInstance createInstance(org.kogito.poc.Flow3Model value) {
        return new org.kogito.poc.Flow3ProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.kogito.poc.Flow3ProcessInstance createInstance(java.lang.String businessKey, org.kogito.poc.Flow3Model value) {
        return new org.kogito.poc.Flow3ProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.kogito.poc.Flow3ProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.kogito.poc.Flow3Model value) {
        return new org.kogito.poc.Flow3ProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.kogito.poc.Flow3Model createModel() {
        return new org.kogito.poc.Flow3Model();
    }

    public org.kogito.poc.Flow3ProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.kogito.poc.Flow3Model) value);
    }

    public org.kogito.poc.Flow3ProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.kogito.poc.Flow3Model) value);
    }

    public org.kogito.poc.Flow3ProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kogito.poc.Flow3ProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.kogito.poc.Flow3ProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kogito.poc.Flow3ProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("flow3", true);
        factory.name("flow3");
        factory.packageName("org.kogito.poc");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_15A6A6A0-81C3-458B-9D37-56FB4AAF2908"));
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.name("Start");
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.interrupting(true);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("UniqueId", "_15A6A6A0-81C3-458B-9D37-56FB4AAF2908");
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("EventType", "none");
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("x", 171);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("width", 56);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("y", 199);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.metaData("height", 56);
        startNode_15A6A6A0_81C3_458B_9D37_56FB4AAF2908.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A0EB9532-1C40-4B17-82CB-5E417D384A74"));
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.name("End");
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.terminate(false);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("UniqueId", "_A0EB9532-1C40-4B17-82CB-5E417D384A74");
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("x", 677);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("width", 56);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("y", 200);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.metaData("height", 56);
        endNode_A0EB9532_1C40_4B17_82CB_5E417D384A74.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70D7CFA5-5390-417B-B866-75274FF9C00A"));
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.name("UserTask");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.workParameter("Content", "GetUserID");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.workParameter("NodeName", "UserTask");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.workParameter("Skippable", "false");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.workParameter("TaskName", "DoSomething3");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.workParameter("UNIQUE_TASK_ID", "_70D7CFA5-5390-417B-B866-75274FF9C00A");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_70D7CFA5-5390-417B-B866-75274FF9C00A_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("c46b6881-3a3f-46f0-af32-bea7a1ff94fd", "EXPRESSION (DoSomething3)", "java.lang.Object", "DoSomething3"), new org.jbpm.workflow.core.impl.DataDefinition("_70D7CFA5-5390-417B-B866-75274FF9C00A_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_70D7CFA5-5390-417B-B866-75274FF9C00A_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("45ab8763-e6b1-47d5-b507-0ce69af0ba93", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_70D7CFA5-5390-417B-B866-75274FF9C00A_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_70D7CFA5-5390-417B-B866-75274FF9C00A_ContentInputX", "Content", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("1843140a-006a-4654-b397-361b2120aefb", "EXPRESSION (GetUserID)", "java.lang.Object", "GetUserID"), new org.jbpm.workflow.core.impl.DataDefinition("_70D7CFA5-5390-417B-B866-75274FF9C00A_ContentInputX", "Content", "Object", null))), null));
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.done();
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.metaData("UniqueId", "_70D7CFA5-5390-417B-B866-75274FF9C00A");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.metaData("elementname", "UserTask");
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.metaData("x", 389);
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.metaData("width", 154);
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.metaData("y", 177);
        humanTaskNode_70D7CFA5_5390_417B_B866_75274FF9C00A.metaData("height", 102);
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70D7CFA5-5390-417B-B866-75274FF9C00A"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A0EB9532-1C40-4B17-82CB-5E417D384A74"), "_B0DA8C1B-1679-4C63-BD18-46E7AC55DAFF");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_15A6A6A0-81C3-458B-9D37-56FB4AAF2908"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70D7CFA5-5390-417B-B866-75274FF9C00A"), "_D4768A75-6738-4B86-814A-219D82D33135");
        factory.validate();
        return factory.getProcess();
    }
}
