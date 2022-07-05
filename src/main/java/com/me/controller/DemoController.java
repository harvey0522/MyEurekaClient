package com.me.controller;

import com.me.vo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
public class DemoController {

    @Value("${test.param}")
    String test;

    @Autowired
    ApplicationContext applicationContext;

    ThreadLocal local=new ThreadLocal();

    List<Long> list=new ArrayList<>();

    @GetMapping("/test/get/{msg}")
    public String get(@PathVariable String msg){
        log.info("param:{}",test);
        long l = System.currentTimeMillis();
        list.add(l);
        local.set(list);
       // applicationContext.publishEvent(new RefreshEvent(test,null,null));
        log.info("person:{}",person);
        return test+msg;
    }

    @Autowired
    private Person person;

}
