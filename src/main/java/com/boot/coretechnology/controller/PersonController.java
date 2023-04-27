package com.boot.coretechnology.controller;

import com.boot.coretechnology.entity.Person;
import com.boot.coretechnology.entity.PersonHasPet;
import com.boot.coretechnology.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wang
 * @create 2022-2022-01-13:11
 */
@RestController
@EnableConfigurationProperties(Person.class)
public class PersonController {

    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person person(){
        return  person;
    }

    @RequestMapping("/personParam")
    public Map<String,Object> user(PersonHasPet person){
        Map<String,Object> map = new HashMap<>();

        map.put("person",person);


        return map;
    }

    @RequestMapping("/writePerson")
    public Person writePerson(){
        Person person = new Person();

        person.setAge(18);
        person.setUserName("wanglaowu");
        person.setBirth(new Date(2002,2,11));

        return person;

    }
}
