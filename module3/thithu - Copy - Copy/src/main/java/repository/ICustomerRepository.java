package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> searchCustomer(String str);

    boolean add(Customer customer);

    boolean remove(int id);

    List<Customer> findAll();

    List<Customer> searchById(int search);

    boolean edit(int id,Customer customer);

}
