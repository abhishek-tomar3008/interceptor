package com.jlw.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AuditEventHandler {

    @EventListener
    @Async
    public void handleEvent(AuditEvent auditEvent) {
       
         
            System.out.println("auditHandler executing: " + auditEvent.getData());
       

    }
}