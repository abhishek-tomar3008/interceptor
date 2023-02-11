package com.jlw.event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.jlw.util.CommonUtils;

import java.util.Map;

@Component
public class AuditEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {

        Map<String, String> data = CommonUtils.requestData();
        data.put("message", message);

         AuditEvent<LogData> logdata=new AuditEvent<LogData>(new LogData(data));

        applicationEventPublisher.publishEvent(logdata);
    }
}
