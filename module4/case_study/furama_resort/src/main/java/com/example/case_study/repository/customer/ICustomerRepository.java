package com.example.case_study.repository.customer;

import com.example.case_study.dto.customer.CustomerView;
import com.example.case_study.dto.customer.UsedByCustomerView;
import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "select * from customer c where c.name like concat('%',:name,'%')    order by c.name",
            countQuery = "select * from customer c where c.name like concat('%',:name,'%') order by c.name"
            , nativeQuery = true)
    Page<Customer> searchName(@Param("name") String name, Pageable pageable);

//    @Query(value = "select c.id, c.customer_type_id as customerTypeId, c.name ,c.date_of_birth as dateOfBirth,c.phone_number as phoneNumber,c.email,c.gender from customer as c where  c.flag_delete  = true and (c.name like concat('%',:name,'%') and c.email like concat('%',:email,'%') and c.customer_type_id like concat ('%',:customerTypeId,'%') )"
//            , countQuery = "select c.id, c.customer_type_id as customerTypeId, c.name ,c.date_of_birth as dateOfBirth,c.phone_number as phoneNumber,c.email,c.gender from customer as c where  c.flag_delete  = true and (  c.name like concat('%',:name,'%') and c.email like concat('%',:email,'%') and c.customer_type_id like concat ('%',:customerTypeId,'%'))"
//            , nativeQuery = true)
//    Page<CustomerView> searchView(@Param("name") String name, @Param("email") String email, @Param("customerTypeId") String customerTypeId, Pageable pageable); OKKKKKK

    @Query(value = "select c.id, c.customer_type_id as customerTypeId, c.name ,c.date_of_birth as dateOfBirth,c.phone_number as phoneNumber,c.email,c.gender,ct.name as customerTypeName from customer as c join customer_type as ct on c.customer_type_id = ct.id where  c.flag_delete  = false and (c.name like concat('%',:name,'%') and c.email like concat('%',:email,'%') and c.customer_type_id like concat ('%',:customerTypeId,'%') )"
            , countQuery = "select c.id, c.customer_type_id as customerTypeId, c.name ,c.date_of_birth as dateOfBirth,c.phone_number as phoneNumber,c.email,c.gender,ct.name as customerTypeName from customer as c join customer_type as ct on c.customer_type_id = ct.id where  c.flag_delete  = false and (  c.name like concat('%',:name,'%') and c.email like concat('%',:email,'%') and c.customer_type_id like concat ('%',:customerTypeId,'%'))"
            , nativeQuery = true)
    Page<CustomerView> searchView(@Param("name") String name, @Param("email") String email, @Param("customerTypeId") String customerTypeId, Pageable pageable);


    @Transactional
    @Modifying
    @Query(value = "update customer c set c.flag_delete = false where c.id = :id", nativeQuery = true)
    void removeFlag(@Param("id") Long id);



    @Query(value="select con.id as contractId, c.id, c.customer_type_id as customerTypeId, c.name ,c.date_of_birth as dateOfBirth,c.phone_number as phoneNumber,c.email,c.gender,ct.name as customerTypeName from customer as c join customer_type as ct on c.customer_type_id = ct.id join contract as con on c.id = con.customer_id where  c.flag_delete  = false and (c.name like concat('%',:name,'%') and c.email like concat('%',:email,'%') and c.customer_type_id like concat ('%',:customerTypeId,'%') )"
            ,countQuery="select con.id as contractId, c.id, c.customer_type_id as customerTypeId, c.name ,c.date_of_birth as dateOfBirth,c.phone_number as phoneNumber,c.email,c.gender,ct.name as customerTypeName from customer as c join customer_type as ct on c.customer_type_id = ct.id join contract as con on c.id = con.customer_id where  c.flag_delete  = false and (c.name like concat('%',:name,'%') and c.email like concat('%',:email,'%') and c.customer_type_id like concat ('%',:customerTypeId,'%') )"
            ,nativeQuery=true)
    Page<UsedByCustomerView> showListUsedByCustomer(@Param("name") String name, @Param("email") String email, @Param("customerTypeId") String customerTypeId, Pageable pageable);
}
