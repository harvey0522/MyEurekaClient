package com.me.vo;

import com.sun.tools.javac.util.List;

import java.util.Optional;
import java.util.UUID;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void shutdown(){
        System.out.println("执行shutdown");
    }

    public static void main(String[] args) {
        System.out.println(">>>>>"+UUID.randomUUID().toString());
        String s="678918448722219009";
        Long ss = Long.valueOf(s);
        System.out.println(ss);

        List<Integer> of = List.of(1, 2, 3, 4);

        Optional<Integer> first = of.stream().findAny();
        System.out.println(first);
        boolean present = of.stream().filter(key -> key == 5).findFirst().isPresent();

        System.out.println(">>>>>>>"+present);
    }
}
