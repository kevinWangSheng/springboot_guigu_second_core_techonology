package com.boot.coretechnology.controller;

import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @create 2022-2022-02-15:58
 */
@RestController
public class MatrixVariableTest {

    @RequestMapping("/car/{path}")
    public Map carseSell(@MatrixVariable("type")String type,
                         @MatrixVariable("brand")List<String> brands,
                         @PathVariable("path")String path){
        Map<String,Object> map = new HashMap();

        map.put("type",type);
        map.put("brand", brands);
        map.put("path", path);

        return map;
    }
}
