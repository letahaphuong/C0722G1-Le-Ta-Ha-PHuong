package com.example.case_study.service.contract.impl;

import com.example.case_study.dto.attach_facility_list.AttachFacilityListView;
import com.example.case_study.dto.contract.ContractView;
import com.example.case_study.model.contract.Contract;
import com.example.case_study.repository.contract.IContractRepository;
import com.example.case_study.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService implements IContractService {

    @Autowired
    IContractRepository contractRepository;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Optional<Contract> findById(Long id) {
        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Long id) {
        contractRepository.deleteById(id);
    }

    @Override
    public void removeFlag(Long id) {

    }

    @Override
    public Page<ContractView> showListContract(Pageable pageable) {
        return contractRepository.showListContract(pageable);
    }

    @Override
    public List<ContractView> showListContracts() {
        return contractRepository.showListContracts();
    }

//    @Override
//    public List<AttachFacilityListView> getAttachFacility() {
//        return contractRepository.getAttachFacility();
//    }
}
