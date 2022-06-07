package com.me.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface DemoFeign2 {
    @GetMapping("/demo1/get")
    public String get(@RequestParam  String msg);
}
