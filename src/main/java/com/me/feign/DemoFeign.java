package com.me.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="myclient")
public interface DemoFeign {
    @GetMapping("/demo1/get")
    public String get(@RequestParam  String msg);
}
