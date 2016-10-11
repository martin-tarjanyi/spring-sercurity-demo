package com.martin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController
{
    @RequestMapping("/user")
    public String userSite()
    {
        return "user";
    }
}
