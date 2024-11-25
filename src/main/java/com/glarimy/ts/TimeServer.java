package com.glarimy.ts;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeServer {
    @GetMapping
    public String getTime(){
        return new Date().toString();
    }
}
