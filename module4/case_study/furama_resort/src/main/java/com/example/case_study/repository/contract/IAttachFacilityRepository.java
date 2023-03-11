package com.example.case_study.repository.contract;

import com.example.case_study.dto.attach_facility_list.AttachFacilityListView;
import com.example.case_study.model.contract.AttachFacility;
import com.example.case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.sound.sampled.Line;
import java.util.List;


public interface IAttachFacilityRepository extends JpaRepository<AttachFacility, Long> {

    //    @Query(value = "select cus.name as nameCustomer,fat.name as nameFacility,con.start_date as startDate,con.end_date as endDate,con.deposit from customer as cus join contract as con on cus.id = con.customer_id join facility as fat on con.facility_id = fat.id"
//            , countQuery = "select cus.name as nameCustomer,fat.name as nameFacility,con.start_date as startDate,con.end_date as endDate,con.deposit from customer as cus join contract as con on cus.id = con.customer_id join facility as fat on con.facility_id = fat.id"
//            , nativeQuery = true)
//    Page<Contract> showListContract(Pageable pageable);
//    @Query(value = "select con.id as contractId ,count(cd.quantity) as quantity, count(cd.id) as quantityContractDetail, af.name as attachFacilityName, af.status,af.unit from contract con join contract_detail cd on con.id = cd.contract_id join attach_facility as af join customer cus on con.customer_id = cus.id where con.id = :id group by af.id;"
//            , countQuery = "select con.id as contractId ,count(cd.quantity) as quantity, count(cd.id) as quantityContractDetail, af.name as attachFacilityName, af.status,af.unit from contract con join contract_detail cd on con.id = cd.contract_id join attach_facility as af join customer cus on con.customer_id = cus.id where con.id =: id group by af.id; "
//            , nativeQuery = true)
//    List<AttachFacilityListView> getAttachFacility(@Param("id") Long id);
//
//    @Query(value = "select con.id as contractId ,count(cd.quantity) as quantity, af.name as attachFacilityName, af.status,af.unit\n" +
//            "from contract con\n" +
//            "         join contract_detail cd on con.id = cd.contract_id\n" +
//            "         join attach_facility as af\n" +
//            "         join customer cus on con.customer_id = cus.id\n" +
//            "where con.id =:id\n" +
//            "group by af.name;;"
//            , countQuery = "select con.id as contractId ,count(cd.quantity) as quantity, af.name as attachFacilityName, af.status,af.unit\n" +
//            "from contract con\n" +
//            "         join contract_detail cd on con.id = cd.contract_id\n" +
//            "         join attach_facility as af\n" +
//            "         join customer cus on con.customer_id = cus.id\n" +
//            "where con.id =:id\n" +
//            "group by af.name;"
//            , nativeQuery = true)
//    List<AttachFacilityListView> getAttachFacility(@Param("id") Long id);


    @Query(value = " select con.id as contractId , a.name as attachFacilityName, a.status,a.unit,cd.quantity from contract as con join contract_detail cd on con.id = cd.contract_id join attach_facility a on cd.attach_facility_id = a.id where contract_id=:id "
            , countQuery = "select con.id as contractId , a.name as attachFacilityName, a.status,cd.unit,cd.quantity as quantity from contract as con join contract_detail cd on con.id = cd.contract_id join attach_facility a on cd.attach_facility_id = a.id where contract_id=:id"
            , nativeQuery = true)
    List<AttachFacilityListView> getAttachFacility(@Param("id") Long id);
}
