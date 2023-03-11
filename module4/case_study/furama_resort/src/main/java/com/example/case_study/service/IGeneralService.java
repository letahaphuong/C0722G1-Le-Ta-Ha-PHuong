package com.example.case_study.service;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface IGeneralService<T>  {
    List<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);

//    Page<T> searchName(String searchByName, Pageable pageable);

    void removeFlag(Long id);

}
