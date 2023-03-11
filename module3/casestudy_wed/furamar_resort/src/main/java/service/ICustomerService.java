package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    boolean add(Customer customer);

    List<Customer> findCustomer(String str);

    List<Customer> findAll();

    boolean remove(int id);

    boolean update(int id,Customer customer);
}
