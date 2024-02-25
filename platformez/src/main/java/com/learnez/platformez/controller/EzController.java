package com.learnez.platformez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EzController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }

}
