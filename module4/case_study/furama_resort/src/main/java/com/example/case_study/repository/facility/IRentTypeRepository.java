package com.example.case_study.repository.facility;

import com.example.case_study.model.facility.Facility;
import com.example.case_study.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType,Long> {
}
