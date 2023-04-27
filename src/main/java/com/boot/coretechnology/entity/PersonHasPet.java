package com.boot.coretechnology.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author wang
 * @create 2022-2022-04-17:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonHasPet {
    private String userName;
    private Date birth;
    private Pet pet;
    private Integer age;
}
