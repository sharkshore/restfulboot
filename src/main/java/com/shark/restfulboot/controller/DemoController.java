package com.shark.restfulboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuze on 2017/8/23.
 */
@RestController
@Slf4j
public class DemoController {


    @RequestMapping("/hello")
    public String hello(){
        log.info("hello,springboot");
        return "hello,world";
    }

    @RequestMapping("/testparam")
    public String testparam(@RequestParam String name){
        log.info(name);
        return "hello,param";
    }

}
