package com.spring.MySql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Automobile {
    private int id;
    private String color;
    private String type;
}
