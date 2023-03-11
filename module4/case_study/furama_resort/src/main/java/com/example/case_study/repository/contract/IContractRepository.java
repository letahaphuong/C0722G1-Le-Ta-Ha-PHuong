package com.example.case_study.repository.contract;


import com.example.case_study.dto.contract.ContractView;
import com.example.case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IContractRepository extends JpaRepository<Contract, Long> {

//    @Query(value = "select cus.name as nameCustomer,fat.name as nameFacility,con.start_date as startDate,con.end_date as endDate,con.deposit,con.id from customer as cus join contract as con on cus.id = con.customer_id join facility as fat on con.facility_id = fat.id"
//            , countQuery = "select cus.name as nameCustomer,fat.name as nameFacility,con.start_date as startDate,con.end_date as endDate,con.deposit,con.id from customer as cus join contract as con on cus.id = con.customer_id join facility as fat on con.facility_id = fat.id"
//            , nativeQuery = true)

    // ==================== ở trên Okie "Không có toltal"==============================

    @Query(value = "SELECT c.id, c.start_date as startDate, c.end_date as endDate, c.deposit, cus.name as nameCustomer,f.name as nameFacility, (sum(ifnull(cd.quantity, 0) * ifnull(af.cost, 0)) + f.cost) AS totalValue,employee.name as employeeName FROM contract c left join employee on c.employee_id = employee.id LEFT JOIN contract_detail cd ON c.id = cd.contract_id LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id LEFT JOIN facility f ON c.facility_id = f.id join customer as cus on c.customer_id = cus.id GROUP BY c.id ORDER BY c.id"
            ,countQuery="SELECT c.id, c.start_date as startDate, c.end_date as endDate, c.deposit, cus.name as nameCustomer,f.name as nameFacility, (sum(ifnull(cd.quantity, 0) * ifnull(af.cost, 0)) + f.cost) AS totalValue,employee.name as employeeName FROM contract c left join employee on c.employee_id = employee.id LEFT JOIN contract_detail cd ON c.id = cd.contract_id LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id LEFT JOIN facility f ON c.facility_id = f.id join customer as cus on c.customer_id = cus.id GROUP BY c.id ORDER BY c.id"
            , nativeQuery = true)
    Page<ContractView> showListContract(Pageable pageable);

    @Query(value = "SELECT c.id, c.start_date as startDate, c.end_date as endDate, c.deposit, cus.name as nameCustomer,f.name as nameFacility, (sum(ifnull(cd.quantity, 0) * ifnull(af.cost, 0)) + f.cost) AS totalValue,employee.name as employeeName FROM contract c left join employee on c.employee_id = employee.id LEFT JOIN contract_detail cd ON c.id = cd.contract_id LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id LEFT JOIN facility f ON c.facility_id = f.id join customer as cus on c.customer_id = cus.id GROUP BY c.id ORDER BY c.id"
            ,countQuery="SELECT c.id, c.start_date as startDate, c.end_date as endDate, c.deposit, cus.name as nameCustomer,f.name as nameFacility, (sum(ifnull(cd.quantity, 0) * ifnull(af.cost, 0)) + f.cost) AS totalValue,employee.name as employeeName FROM contract c left join employee on c.employee_id = employee.id LEFT JOIN contract_detail cd ON c.id = cd.contract_id LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id LEFT JOIN facility f ON c.facility_id = f.id join customer as cus on c.customer_id = cus.id GROUP BY c.id ORDER BY c.id"
            , nativeQuery = true)
    List<ContractView> showListContracts();


//    @Query(value = "select cus.name as customerName, con.id as contractId,cd.id as contractDetailId,cd.quantity,af.name as attachFacilityName,af.cost,af.status,af.unit from contract con join contract_detail cd on con.id = cd.contract_id join attach_facility as af join customer cus on con.customer_id = cus.id "
//            ,countQuery="select cus.name as customerName, con.id as contractId,cd.id as contractDetailId,cd.quantity,af.name as attachFacilityName,af.cost,af.status,af.unit from contract con join contract_detail cd on con.id = cd.contract_id join attach_facility as af join customer cus on con.customer_id = cus.id  "
//            , nativeQuery = true)
//    List<AttachFacilityListView> getAttachFacility();
}
