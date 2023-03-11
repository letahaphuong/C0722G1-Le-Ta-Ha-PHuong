package com.example.case_study.repository.facility;

import com.example.case_study.dto.facility.FacilityView;
import com.example.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IFacilityRepository extends JpaRepository<Facility,Long> {

//    @Query(value = "select * from facility f where f.flag_delete = true and (f.name like concat('%',:name,'%') or f.facility_type_id like concat ('%',:facilityType,'%')) order by f.name",
//          countQuery ="select * from facility f where f.flag_delete = true and (f.name like concat('%',:name,'%') or f.facility_type_id like concat ('%',:facilityType,'%')) order by f.name"
//            ,nativeQuery = true)
//    Page<Facility> searchName(@Param("name") String name,@Param("facilityType") String facilityType, Pageable pageable);

    @Query(value = "select f.id ,f.name,f.description_other_convenience as descriptionOtherConvenience,f.max_peo_pel as maxPeoPel, f.facility_type_id as facilityType, f.standard_room as standardRoom, f.facility_free as facilityFree,ft.name as facilityTypeNames,rt.name as rentNames  from facility as f join facility_type as ft on ft.id=f.facility_type_id join rent_type as rt on rt.id=f.rent_type_id where f.flag_delete = false and (f.name like concat('%',:name,'%') and f.facility_type_id like concat('%',:id,'%')) order by f.name",
            countQuery ="select f.id, f.name,f.description_other_convenience as descriptionOtherConvenience,f.max_peo_pel as maxPeoPel, f.facility_type_id as facilityType, f.standard_room as standardRoom, f.facility_free as facilityFree,ft.name as facilityTypeNames,rt.name as rentNames  from facility as f join facility_type as ft on ft.id=f.facility_type_id join rent_type as rt on rt.id=f.rent_type_id where f.flag_delete = false and (f.name like concat('%',:name,'%') and f.facility_type_id like concat('%',:id,'%')) order by f.name"
            ,nativeQuery = true)
    Page<FacilityView> searchView(@Param("name") String name, @Param("id") String facilityType, Pageable pageable);

//    @Query(value = "select f.id ,f.name,f.description_other_convenience as descriptionOtherConvenience,f.max_peo_pel as maxPeoPel, f.facility_type_id as facilityType, f.standard_room as standardRoom, f.facility_free as facilityFree,ft.name as facilityTypeNames,rt.name as rentNames  from facility as f join facility_type as ft on ft.id=f.facility_type_id join rent_type as rt on rt.id=f.rent_type_id where f.flag_delete = false and (f.name like concat('%',:name,'%') and f.facility_type_id =:id) order by f.name",
//            countQuery ="select f.id ,f.name,f.description_other_convenience as descriptionOtherConvenience,f.max_peo_pel as maxPeoPel, f.facility_type_id as facilityType, f.standard_room as standardRoom, f.facility_free as facilityFree,ft.name as facilityTypeNames,rt.name as rentNames  from facility as f join facility_type as ft on ft.id=f.facility_type_id join rent_type as rt on rt.id=f.rent_type_id where f.flag_delete = false and (f.name like concat('%',:name,'%') and f.facility_type_id =:id) order by f.name"
//            ,nativeQuery = true)
//    Page<FacilityView> searchView(@Param("name") String name, @Param("facilityType") String facilityType, Pageable pageable);

    @Transactional
    @Modifying
    @Query(value = "update facility f set f.flag_delete = true where f.id = :id", nativeQuery = true)
    void removeFlag(@Param("id") Long id);
}
