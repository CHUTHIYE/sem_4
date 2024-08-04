package com.example.microservice_appclient.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class AppclientController {
//    @Autowired
//    private HttpServletRequest request;
//    @GetMapping("student")
//    public String GetStudent() {
//        int serverPort = request.getServerPort();
//        return "Server port: " + serverPort + " Get a student!";
//    }
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "student")
    public String Index(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.getForObject("http://microservice-student-service/student", String.class);
//        return restTemplate.getForObject("http://localhost:8080/student", String.class);
    }

}
