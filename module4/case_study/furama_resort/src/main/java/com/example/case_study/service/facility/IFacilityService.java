package com.example.case_study.service.facility;

import com.example.case_study.dto.facility.FacilityView;
import com.example.case_study.model.facility.Facility;
import com.example.case_study.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface IFacilityService extends IGeneralService<Facility> {
    //        Page<Facility> searchName(String searchByName, Pageable pageable);
    Page<FacilityView> searchView(String name, String facilityType, Pageable pageable);

    void removeFlag(Long id);
}
