package com.wisely.ch9_2.domain;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 * 领域模型类
 * @author Lucifer
 * @date 2018/03/05 14:23
 */
@Data
public class Person {

    @Size(max = 4, min = 2)
    private String name;

    private int age;

    private String nation;

    private String address;

}
