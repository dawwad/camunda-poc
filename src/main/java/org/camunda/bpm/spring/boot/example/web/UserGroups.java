package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.delegate.DelegateExecution;

public class UserGroups implements org.camunda.bpm.engine.delegate.JavaDelegate{


    //String approverGroups="Group A, Group B";

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String approverGroups="accounting, sales";
        String approverUsers="john, mary";

        execution.setVariable("approverUsers",approverUsers);
        execution.setVariable("approverGroups",approverGroups);

    }
}
