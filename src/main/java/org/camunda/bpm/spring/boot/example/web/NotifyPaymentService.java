package org.camunda.bpm.spring.boot.example.web;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class NotifyPaymentService implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(NotifyPaymentService.class.getName());

    public void execute(DelegateExecution execution) throws Exception {

        LOGGER.info("\n\n  ... Now notifying creditor " + execution.getVariable("creditor") + "\n\n");

    }
}
