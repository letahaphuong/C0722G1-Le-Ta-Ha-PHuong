package service.impl;

import model.Employee;
import model.Facility;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository employeeRepository=new EmployeeRepository();
    @Override
    public boolean add(Employee employee) {
        return employeeRepository.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Employee employee) {
        return false;
    }
}
