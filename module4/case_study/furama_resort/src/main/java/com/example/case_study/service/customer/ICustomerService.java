package com.example.case_study.service.customer;

import com.example.case_study.dto.customer.CustomerView;
import com.example.case_study.dto.customer.UsedByCustomerView;
import com.example.case_study.model.customer.Customer;
import com.example.case_study.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface ICustomerService extends IGeneralService<Customer> {
    Page<CustomerView> searchView(String name,String email,String customerTypeId,Pageable pageable);


    Page<UsedByCustomerView> showListUsedByCustomer( String name, String email, String customerTypeId, Pageable pageable);

    void delete(Long id);

    Customer finById(Long id);
}
