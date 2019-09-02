package com.securityservice.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {


    @GetMapping("/")
    public String getHome(){
        return ("<h2>Spring Security</h2>");
    }

    @GetMapping("/user")
    public String getUser(){
        return ("<h2>Hello User</h2>");
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return ("<h2>Hello Admin</h2>");
    }
}
