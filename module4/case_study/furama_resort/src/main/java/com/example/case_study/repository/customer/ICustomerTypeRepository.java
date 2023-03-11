package com.example.case_study.repository.customer;


import com.example.case_study.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Long> {
    @Query(value = "select * from customer c where c.name like concat('%',:name,'%') order by c.name",
            countQuery ="select * from customer c where c.name like concat('%',:name,'%') order by c.name"
            ,nativeQuery = true)
    Page<CustomerType> searchName(@Param("name") String name, Pageable pageable);
}
