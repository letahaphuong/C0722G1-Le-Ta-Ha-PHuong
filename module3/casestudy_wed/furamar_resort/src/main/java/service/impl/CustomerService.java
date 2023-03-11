package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {

    ICustomerRepository customerRepository=new CustomerRepository();

    @Override
    public boolean add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public List<Customer> findCustomer(String str) {
        return customerRepository.findCustomer(str);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean remove(int id) {
        return customerRepository.remove(id);
    }

    @Override
    public boolean update(int id, Customer customer) {
        return customerRepository.update(id, customer);
    }
}
