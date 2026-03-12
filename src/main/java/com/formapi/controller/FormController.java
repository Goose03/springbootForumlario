package com.formapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formapi.services.FormService;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FormController {

    @Autowired
    private FormService formService;

    @PostMapping("/submit")
    public Map<String, String> submitForm(@RequestBody Map<String, Object> formData) {
        return formService.processForm(formData);
    }
}