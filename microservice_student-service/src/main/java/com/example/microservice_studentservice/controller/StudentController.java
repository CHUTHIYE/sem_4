package com.example.microservice_studentservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private HttpServletRequest request;
    @GetMapping("student")
    public String GetStudent() {
        int serverPort = request.getServerPort();
        return "Server port: " + serverPort + " Get a student!";
    }
}
