package com.example.grildemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    public final String PATH_ROOT = "/";

    @RequestMapping(PATH_ROOT)
    public String HelloWorld(){
        return "Hello Welcome SpringBoot!";
    }

}
