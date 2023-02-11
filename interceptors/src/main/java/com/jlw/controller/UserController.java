package com.jlw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlw.event.AuditEventPublisher;
import com.jlw.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private AuditEventPublisher auditEventPublisher;

    @PostMapping
    public String register(@RequestBody User user) {

        // db call

        auditEventPublisher.publishEvent("User saved successfully !!" + user.getUserName());
        return "User saved successfully !!";
    }
}
