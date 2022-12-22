package com.hrms.controller;


import com.hrms.dto.MailRequest;
import com.hrms.dto.MailResponse;
import com.hrms.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmailController {

    @Autowired
    private EmailService service;

    @PostMapping("/sendEmail")
    public MailResponse sendEmail(@RequestBody MailRequest request) {
        Map<String, Object> model = new HashMap<>();
        model.put("Name", request.getName());
        model.put("Location", "Dwarka Residency Awan, Madhya Pradesh, India");
        model.put("IssueDate", "24 Nov, 2022");
        model.put("Mobile", "8518068366");
        model.put("Email", "deepaklodha067@gmail.com");
        model.put("Position", "Software Developer");
        model.put("JoinDate", "01 Dec, 2022");
        model.put("CTC", "500000");
        model.put("Variable", "15%");
        return service.sendEmail(request, model);
    }

}
