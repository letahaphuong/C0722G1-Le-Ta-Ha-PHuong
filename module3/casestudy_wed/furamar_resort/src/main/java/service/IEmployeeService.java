package service;

import model.Employee;
import model.Facility;

import java.util.List;

public interface IEmployeeService {
    boolean add(Employee employee);

    List<Employee> findAll();

    boolean remove(int id);

    boolean update(int id, Employee employee);

}
