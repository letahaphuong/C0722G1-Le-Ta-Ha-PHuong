package repository.impl;

import model.Employee;
import model.Facility;
import repository.BaseRepository;
import repository.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String SELECT_ALL_EMPLOYEE = "call display_all_employee();";
    private static final String INSERT_EMPLOYEE = "CALL add_employee (?,?,?, ?, ?,?, ?, ?,?,?,?) ;";

    @Override
    public boolean add(Employee employee) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_EMPLOYEE);
            callableStatement.setString(1, employee.getName());
            callableStatement.setString(2, employee.getDateOfBirth());
            callableStatement.setString(3, employee.getIdCard());
            callableStatement.setDouble(4, employee.getSalary());
            callableStatement.setString(5, employee.getPhoneNumber());
            callableStatement.setString(6, employee.getEmail());
            callableStatement.setString(7, employee.getAddress());
            callableStatement.setInt(8, employee.getPositionId());
            callableStatement.setInt(9, employee.getEducationDegreeId());
            callableStatement.setInt(10, employee.getDivisionId());
            callableStatement.setString(11, employee.getUserName());
            return callableStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Employee> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                String idCard = resultSet.getString("id_card");
                double salary = resultSet.getDouble("salary");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String userName = resultSet.getString("username");
                String divisionName = resultSet.getString("division_name");
                String positionName = resultSet.getString("position_name");
                String educationDegreeName = resultSet.getString("education_degree_name");
                Employee employee = new Employee(id, name, dateOfBirth, idCard, salary, phoneNumber, email, address, positionId, educationDegreeId, divisionId
                        , userName, divisionName, positionName, educationDegreeName);
                employeeList.add(employee);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
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
