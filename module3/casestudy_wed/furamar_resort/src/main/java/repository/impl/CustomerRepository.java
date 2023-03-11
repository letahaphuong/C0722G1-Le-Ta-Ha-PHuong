package repository.impl;

import model.Customer;
import repository.BaseRepository;
import repository.ICustomerRepository;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String INSERT_USERS_SQL = "CALL add_customer(?,?,?,?,?,?,?,?,?);";
    private static final String SEARCH_CUSTOMER = "SELECT * FROM customer WHERE name LIKE ? OR  address like ? ;";
    private static final String SELECT_ALL_USERS = "CALL display_all();";
    private static final String DELETE_USERS_SQL = "CALL delete_customer(?);";
    private static final String UPDATE_USERS_SQL = "CALL update_customer(?,?,?,?,?,?,?,?,?);";


    @Override
    public boolean add(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_USERS_SQL);
            callableStatement.setInt(1, customer.getId());
            callableStatement.setInt(2, customer.getCustomerTypeId());
            callableStatement.setString(3, customer.getName());
            callableStatement.setString(4, customer.getDateOfBirth());
            callableStatement.setBoolean(5, Boolean.parseBoolean(String.valueOf(customer.isGender())));
            callableStatement.setString(6, customer.getIdCard());
            callableStatement.setString(7, customer.getPhoneNumber());
            callableStatement.setString(8, customer.getEmail());
            callableStatement.setString(9, customer.getAddress());
            return callableStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public List<Customer> findCustomer(String str) {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> userList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SEARCH_CUSTOMER);
            ps.setString(1, '%' + str + '%');
            ps.setString(2, '%' + str + '%');
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int customerTypeIdid = resultSet.getInt("customer_type_id");
                String nameCustomerType=resultSet.getString("name");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Customer customer = new Customer(id, customerTypeIdid,nameCustomerType, name, dateOfBirth, gender, idCard, phoneNumber, email, address);
                userList.add(customer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public List<Customer> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String nameCustomerType=resultSet.getString("nameCustomerType");
                String name = resultSet.getString("name");
                String dateOfBirth = resultSet.getString("date_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String idCard = resultSet.getString("id_card");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Customer customer = new Customer(id, customerTypeId,nameCustomerType, name, dateOfBirth, gender, idCard, phoneNumber, email, address);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean remove(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_USERS_SQL);
            callableStatement.setInt(1, id);
            return callableStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_USERS_SQL);
            ps.setInt(1, customer.getCustomerTypeId());
            ps.setString(2, customer.getName());
            ps.setDate(3, Date.valueOf(customer.getDateOfBirth()));
            ps.setBoolean(4, Boolean.parseBoolean(String.valueOf(customer.isGender())));
            ps.setString(5, customer.getIdCard());
            ps.setString(6, customer.getPhoneNumber());
            ps.setString(7, customer.getEmail());
            ps.setString(8, customer.getAddress());
            ps.setInt(9, customer.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }
}
