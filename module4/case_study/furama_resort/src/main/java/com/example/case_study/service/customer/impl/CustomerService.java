package com.example.case_study.service.customer.impl;

import com.example.case_study.dto.customer.CustomerView;
import com.example.case_study.dto.customer.UsedByCustomerView;
import com.example.case_study.model.customer.Customer;
import com.example.case_study.repository.customer.ICustomerRepository;
import com.example.case_study.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void removeFlag( Long id) {
        customerRepository.removeFlag(id);
    }


    @Override
    public Page<CustomerView> searchView(String search,String email,String customerTypeId,Pageable pageable) {
        return customerRepository.searchView(search,email,customerTypeId,pageable);
    }

    @Override
    public Page<UsedByCustomerView> showListUsedByCustomer(String name, String email, String customerTypeId, Pageable pageable) {
        return customerRepository.showListUsedByCustomer(name,email,customerTypeId,pageable);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer finById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

}
