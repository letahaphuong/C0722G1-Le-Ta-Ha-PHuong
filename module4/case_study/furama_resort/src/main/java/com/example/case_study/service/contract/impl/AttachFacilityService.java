package com.example.case_study.service.contract.impl;

import com.example.case_study.dto.attach_facility_list.AttachFacilityListView;
import com.example.case_study.model.contract.AttachFacility;
import com.example.case_study.repository.contract.IAttachFacilityRepository;
import com.example.case_study.service.contract.IAttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttachFacilityService implements IAttachFacilityService {

    @Autowired
    IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }

    @Override
    public Optional<AttachFacility> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(AttachFacility attachFacility) {
        attachFacilityRepository.save(attachFacility);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void removeFlag(Long id) {

    }

    @Override
    public List<AttachFacilityListView> getAttachFacility(Long id) {
        return attachFacilityRepository.getAttachFacility(id);
    }
}
