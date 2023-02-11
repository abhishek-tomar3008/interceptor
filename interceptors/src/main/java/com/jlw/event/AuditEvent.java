package com.jlw.event;

import org.springframework.context.ApplicationEvent;



public class AuditEvent<T> extends ApplicationEvent {
    private final T data;

    public AuditEvent(T data) {
        super(data);
        this.data = data;
    }

	public T getData() {
		return data;
	}
    
}
