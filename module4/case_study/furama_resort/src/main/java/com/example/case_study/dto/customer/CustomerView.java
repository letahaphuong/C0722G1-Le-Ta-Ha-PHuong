package com.example.case_study.dto.customer;

import com.example.case_study.model.customer.CustomerType;


public interface CustomerView {
    Long getId();

    CustomerType getCustomerType();

    String getCustomerTypeName();

    String getName();

    String getDateOfBirth();

    String getPhoneNumber();

    boolean isGender();

    String getAddress();

    String getEmail();
}
