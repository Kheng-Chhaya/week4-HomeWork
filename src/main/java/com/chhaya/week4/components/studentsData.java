package com.chhaya.week4.components;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chhaya.week4.model.Students;


@Configuration
public class studentsData 
{
    @Value("${description}")
    private String bio;
    @Bean 
   public List<Students> returnStudentData()
    {
        List<Students> students = new ArrayList<>();
        Students std = new Students();
        std.setId(1);
        std.setName("Chhaya Kheng");
        std.setFrom("Banteay Meanchey");
        std.setBio(bio);
        students.add(std);
        
        return students;

    }
    
}
