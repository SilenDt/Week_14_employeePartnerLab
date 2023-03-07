package com.codeclan.employeeLab.employeePartnerLab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assignments")
public class Assignment {
    //INSTANCE VARIABLES:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //ONE TO MANY RELATIONSHIP
    @JsonIgnoreProperties({"assignment"})
    @OneToMany(mappedBy = "assignment")
    private List<Employee> employees;


    //CONSTRUCTOR:
    public Assignment() {}

    //GETTERS AND SETTERS:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
