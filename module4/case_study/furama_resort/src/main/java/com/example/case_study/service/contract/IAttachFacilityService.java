package com.example.case_study.service.contract;

import com.example.case_study.dto.attach_facility_list.AttachFacilityListView;
import com.example.case_study.model.contract.AttachFacility;
import com.example.case_study.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IAttachFacilityService extends IGeneralService<AttachFacility> {
    List<AttachFacilityListView> getAttachFacility(Long id);

}
