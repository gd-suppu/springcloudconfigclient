package com.client.SpringCloudConfigClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Environment environment;
    @GetMapping("/msg")
    public String getMessage(){
        return environment.getProperty("welcome.messsage");
    }
}
