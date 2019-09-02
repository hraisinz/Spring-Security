package com.securityservice.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @GetMapping("/home")
    public String getHome(){
        return ("<h2>Spring Security</h2>");
    }
}
