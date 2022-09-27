package com.chhaya.week4.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Students 
{
    private Integer id;
    private String name;
    private String bio;
    private String from;
}
