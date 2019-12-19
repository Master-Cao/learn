package me.cs.boot.controller;

import me.cs.boot.bean.MasterProperties;
import me.cs.boot.bean.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private MasterProperties masterProperties;
    @Autowired
    private TestProperties testProperties;
    @RequestMapping("/")
    public String index(){
        return "hello spring boot.";
    }
    @RequestMapping("/master")
    public String master(){
        return masterProperties.toString();
    }
    @RequestMapping("/test")
    public String test(){
        return testProperties.toString();
    }
}
