package com.example.workflow.test;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TokenDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("hello!");
        Object o = delegateExecution.getVariable("sessionToken");
        System.out.println("o = " + o);
        delegateExecution.setVariable("sessionToken", "111");

        System.out.println(delegateExecution.getVariables());
    }
}
