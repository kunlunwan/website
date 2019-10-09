package com.hust.docker.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hust {
    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
