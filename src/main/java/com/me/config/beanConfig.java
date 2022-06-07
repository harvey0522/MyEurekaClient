package com.me.config;

import com.me.vo.Person;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beanConfig {

    @Bean(destroyMethod = "shutdown")
    public Person person(){
        Person person=new Person("aaa",111);

        return person;
    }
}
