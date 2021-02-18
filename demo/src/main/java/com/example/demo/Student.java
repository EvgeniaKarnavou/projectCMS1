package com.example.demo;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="students")
class Student {
    @Id @GeneratedValue @Column(name="id") @Getter @Setter
    Long id;
    
    @Column(name="first_name") @Getter @Setter
    String firstName;
    
    @Column(name="last_name") @Getter @Setter
    String lastName;
    
    @ManyToOne @JoinColumn(name="project_id") @Getter @Setter
    Project project;
    
    public Student() {
        firstName = "";
        lastName = "";
    }
    
    public Student(String first, String last) {
        firstName = first;
        lastName = last;
    }
}

