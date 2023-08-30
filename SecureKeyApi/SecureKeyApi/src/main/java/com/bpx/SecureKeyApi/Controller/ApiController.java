package com.bpx.SecureKeyApi.Controller;

import com.bpx.SecureKeyApi.Service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    @Autowired
    private ApiService service;

    @PostMapping("/firstCall")
    public Map<String,Object> getInfoDetails(){
        Map<String,Object> response = new HashMap<>();
        System.out.println(service.getServiceResponse());
        return response;
    }
}
