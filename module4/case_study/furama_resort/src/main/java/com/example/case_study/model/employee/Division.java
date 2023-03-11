package com.example.case_study.model.employee;

import com.example.case_study.model.customer.Customer;

import javax.persistence.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "division")
    private Set<Employee> employees;
}
