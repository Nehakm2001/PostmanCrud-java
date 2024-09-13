package com.example.postman.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "Student_id")
    private int id;

    @Column(name = "Student_Name")
    private String name;

    @Column(name = "Student_Marks")
    private int marks;
}
