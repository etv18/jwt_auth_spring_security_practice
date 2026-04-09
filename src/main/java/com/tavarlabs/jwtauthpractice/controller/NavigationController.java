package com.tavarlabs.jwtauthpractice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/api/v1/nav")
@RestController
public class NavigationController {

    @GetMapping(path = "/welcome")
    public String welcome(){
        return "Visible view for all users";
    }

    @GetMapping(path = "/for/users")
    public String viewForUsers(Authentication authentication){
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return "Hi " + userDetails.getUsername() + "!. This view is only for authenticated users...";
    }

    @GetMapping(path = "/special")
    public String specialView(){
        return "Special view for you users with jwt";
    }

}
