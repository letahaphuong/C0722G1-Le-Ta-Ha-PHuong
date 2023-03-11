package com.example.case_study.repository.employee;

import com.example.case_study.model.employee.EducationDegree;
import com.example.case_study.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree,Long> {
}
