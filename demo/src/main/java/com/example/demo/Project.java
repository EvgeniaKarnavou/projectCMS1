package com.example.demo;

import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="projects")
class Project {
    @Id @GeneratedValue @Column(name="id") @Getter @Setter
    Long id;
    
    @Column(name="name") @Getter @Setter
    String projectName;
    
    @OneToMany(mappedBy="project") @Getter @Setter
    List<Student> teamMembers;
    
    public Project() {
        projectName = "";
    }
    
    public Project(String name) {
        projectName = name;
    }
}

