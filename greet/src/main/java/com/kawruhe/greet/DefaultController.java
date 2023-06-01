package com.kawruhe.greet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Map.entry;

@RestController
public class DefaultController {

    @Value("${greet}")
    private String greet;
    @GetMapping("/")
    public Map getInfo(){
        return Map.ofEntries(
                entry("message",greet),
                entry("status","Running"),
                entry("Version","0.0.1")
        );
    }
}