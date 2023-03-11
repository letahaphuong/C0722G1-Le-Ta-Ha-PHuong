package com.example.case_study.service.employee.impl;

import com.example.case_study.model.employee.Division;
import com.example.case_study.model.employee.Employee;
import com.example.case_study.repository.employee.IEmployeeRepository;
import com.example.case_study.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void removeFlag(Long id) {

    }


}
