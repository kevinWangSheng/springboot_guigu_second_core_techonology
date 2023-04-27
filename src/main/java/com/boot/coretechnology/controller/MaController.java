package com.boot.coretechnology.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang
 * @create 2022-2022-01-14:50
 */
@RestController
public class MaController {
    @RequestMapping("/ma1.png")
    public String ma(){
        return "ma1";
    }
}
