package com.example.student.myStudents.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class student {
    @Id
    private int id;
    private String name;
    private int age;
    
    private String gmail;
}
