package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository=new CustomerRepository();
    @Override
    public List<Customer> searchCustomer(String str) {
        return customerRepository.searchCustomer(str);
    }

    @Override
    public boolean add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public boolean remove(int id) {
        return customerRepository.remove(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> searchById(int search) {
        return customerRepository.searchById(search);
    }

    @Override
    public boolean edit(int id, Customer customer) {
        return customerRepository.edit(id, customer);
    }
}
