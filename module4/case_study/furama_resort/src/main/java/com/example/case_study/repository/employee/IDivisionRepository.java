package com.example.case_study.repository.employee;

import com.example.case_study.model.employee.Division;
import com.example.case_study.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Long> {
}
