package repository.impl;

import model.Customer;
import repository.BaseRepository;
import repository.ICustomerRepository;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String SELECT_ALL = "call display_customer();";
    private static final String INSERT_CUSTOMER ="CALL insert_customer(?,?,?,?,?);";
    private static final String DELETE_USERS_SQL ="CALL delete_customer(?);";
    private static final String SEARCH_CUSTOMER ="SELECT * FROM customer WHERE name LIKE ? OR  phone_number like ? ;";
    private static final String SEARCH_CUSTOMER_BY_ID ="SELECT * FROM customer WHERE id LIKE ?;";
    private static final String EDIT_CUSTOMER ="CALL edit_customer(?,?,?,?,?,?)";

    @Override
    public List<Customer> searchCustomer(String str) {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SEARCH_CUSTOMER);
            ps.setString(1, '%' + str + '%');
            ps.setString(2, '%' + str + '%');
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phone_number");
                String startDate = resultSet.getString("start_date");
                int rentTypeId =resultSet.getInt("rent_type_id");
                String note =resultSet.getString("note");
                Customer customer = new Customer(id,name,phoneNumber,startDate,rentTypeId,note);
                customerList.add(customer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(INSERT_CUSTOMER);
            callableStatement.setString(1, customer.getName());
            callableStatement.setString(2, customer.getPhoneNumber());
            callableStatement.setString(3, customer.getStartDate());
            callableStatement.setInt(4, customer.getRentTypeId());
            callableStatement.setString(5, customer.getNote());
            return callableStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_USERS_SQL);
            callableStatement.setInt(1, id);
            callableStatement.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Customer> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement ps=connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet=ps.executeQuery();
            while (resultSet.next()){
                int id =resultSet.getInt("id");
                String name =resultSet.getString("name");
                String phoneNumber=resultSet.getString("phone_number");
                String startDate=resultSet.getString("start_date");
                int rentTypeId=resultSet.getInt("rent_type_id");
                int rentId=resultSet.getInt("rent_id");
                String rentName =resultSet.getString("rent_name");
                String note=resultSet.getString("note");
                Customer customer=new Customer(id,name,phoneNumber,startDate,rentTypeId,rentId,rentName,note);
                customerList.add(customer);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public List<Customer> searchById(int search) {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SEARCH_CUSTOMER_BY_ID);
            ps.setInt(1,   search );
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phone_number");
                String startDate = resultSet.getString("start_date");
                int rentTypeId =resultSet.getInt("rent_type_id");
                String note =resultSet.getString("note");
                Customer customer = new Customer(id,name,phoneNumber,startDate,rentTypeId,note);
                customerList.add(customer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean edit(int id, Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(EDIT_CUSTOMER);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getPhoneNumber());
            ps.setString(3, customer.getStartDate());
            ps.setInt(4, customer.getRentTypeId());
            ps.setString(5, customer.getNote());
            ps.setInt(6, customer.getId());
            return ps.executeUpdate()>0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }
}
