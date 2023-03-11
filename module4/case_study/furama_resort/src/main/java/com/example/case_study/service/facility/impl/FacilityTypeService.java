package com.example.case_study.service.facility.impl;

import com.example.case_study.model.facility.FacilityType;
import com.example.case_study.repository.facility.IFacilityTypeRepository;
import com.example.case_study.service.facility.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    IFacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }

    @Override
    public Optional<FacilityType> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(FacilityType facilityType) {

    }

    @Override
    public void remove(Long id) {

    }



    @Override
    public void removeFlag(Long id) {

    }
}
