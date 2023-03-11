package com.example.case_study.service.contract;

import com.example.case_study.dto.attach_facility_list.AttachFacilityListView;
import com.example.case_study.dto.contract.ContractView;
import com.example.case_study.model.contract.Contract;
import com.example.case_study.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService extends IGeneralService<Contract> {
    Page<ContractView> showListContract(Pageable pageable);
    List<ContractView> showListContracts();

//    List<AttachFacilityListView> getAttachFacility();

}
