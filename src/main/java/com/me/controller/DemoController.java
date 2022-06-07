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
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.scope.GenericScope;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.cloud.endpoint.event.RefreshEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@Slf4j
public class DemoController {

    @Value("${test.param}")
    String test;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    GenericScope genericScope;

    @GetMapping("/demo/get/{msg}")
    public String get(@PathVariable("msg") String msg){
        log.info("param:{}",test);

        genericScope.remove("scopedTarget.eurekaClient");

        applicationContext.publishEvent(new RefreshEvent(test,null,null));
        log.info("person:{}",person);
        return test;
    }

    @Autowired
    private Person person;

}
