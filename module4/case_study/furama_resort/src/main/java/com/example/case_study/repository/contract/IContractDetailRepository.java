package com.example.case_study.repository.contract;

import com.example.case_study.model.contract.Contract;
import com.example.case_study.model.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IContractDetailRepository extends JpaRepository<ContractDetail, Long> {

//    @Query(value = "select cus.name as nameCustomer,fat.name as nameFacility,con.start_date as startDate,con.end_date as endDate,con.deposit from customer as cus join contract as con on cus.id = con.customer_id join facility as fat on con.facility_id = fat.id"
//            , countQuery = "select cus.name as nameCustomer,fat.name as nameFacility,con.start_date as startDate,con.end_date as endDate,con.deposit from customer as cus join contract as con on cus.id = con.customer_id join facility as fat on con.facility_id = fat.id"
//            , nativeQuery = true)
//    Page<Contract> showListContract(Pageable pageable);
}
