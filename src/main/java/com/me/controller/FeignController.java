/*
package com.me.controller;

import com.me.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    DemoFeign demoFeign;


    @GetMapping("/feign/get")
    public String get(String ss){
        return demoFeign.get("feign:"+ss);
    }
}
*/
