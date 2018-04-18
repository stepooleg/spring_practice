package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerWeb {

    @RequestMapping("/")
    public String setUser(){
        return "index";
    }
}
