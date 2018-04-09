package com.cs.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ChenSong
 * @Date: 2018/4/9 13:41
 * @Description: 人员实体类
 */

@Data
//@JSONType(orders = {"sex","age","name"})
public class Person implements Serializable{

    private static final long serialVersionUID = -4664080133008495369L;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private int age;
    /**
     *
     */
    private String sex;

    public Person() {}

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
