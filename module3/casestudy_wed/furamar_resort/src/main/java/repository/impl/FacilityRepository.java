package repository.impl;

import model.Customer;
import model.Facility;
import repository.BaseRepository;
import repository.IFacilityRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    private static final String INSERT_FACILITY = "CALL add_facility( ?, ?,?,?,?,?,?,?, ?,?,?);";
    private static final String SEARCH_FACILITY = "select * from facility where `name` =?;";
    private static final String SELECT_ALL_FACILITY = "CALL display_all_facility();";
    private static final String DELETE_FACILITY = "call delete_facility(?);";
    private static final String UPDATE_FACILITY = "CALL update_facility(?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?,?);";

    @Override
    public boolean add(Facility facility) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_FACILITY);
            ps.setString(1, facility.getName());
            ps.setInt(2, facility.getArea());
            ps.setDouble(3, facility.getCost());
            ps.setInt(4, facility.getMaxPeople());
            ps.setInt(5, facility.getRentTypeId());
            ps.setInt(6, facility.getFacilityTypeId());
            ps.setString(7, facility.getStandardRoom());
            ps.setString(8, facility.getDescriptionOtherConvenience());
            ps.setDouble(9, facility.getPoolArea());
            ps.setInt(10, facility.getNumberOfFloors());
            ps.setString(11, facility.getFacilityFree());

            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public List<Facility> search(String search) {
        Connection connection=BaseRepository.getConnectDB();
        List<Customer> customerList=new ArrayList<>();
        try {
            PreparedStatement ps=connection.prepareStatement(SEARCH_FACILITY);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Facility> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<Facility> facilityList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_FACILITY);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int area = resultSet.getInt("area");
                double cost = resultSet.getDouble("cost");
                int maxPeople = resultSet.getInt("max_people");
                int rentTypeId = resultSet.getInt("rent_type_id");
                String rentTypeName = resultSet.getString("rent_name");
                int facilityTypeId = resultSet.getInt("facility_type_id");
                String facilityTypeName = resultSet.getString("facility_type_name");
                String standardRoom = resultSet.getString("standard_room");
                String descriptionOtherConvenience = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberOfFloors = resultSet.getInt("number_of_floors");
                String facilityFree = resultSet.getString("facility_free");
                Facility facility = new Facility(id, name, area, cost, maxPeople, rentTypeId, rentTypeName, facilityTypeId, facilityTypeName, standardRoom, descriptionOtherConvenience
                        , poolArea, numberOfFloors, facilityFree);
                facilityList.add(facility);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return facilityList;
    }

    @Override
    public boolean remove(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(DELETE_FACILITY);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, Facility facility) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_FACILITY);
            ps.setString(1, facility.getName());
            ps.setDouble(2, facility.getArea());
            ps.setDouble(3, facility.getCost());
            ps.setInt(4, facility.getMaxPeople());
            ps.setInt(5, facility.getRentTypeId());
            ps.setInt(6, facility.getFacilityTypeId());
            ps.setString(7, facility.getStandardRoom());
            ps.setString(8, facility.getDescriptionOtherConvenience());
            ps.setDouble(9, facility.getPoolArea());
            ps.setInt(10, facility.getNumberOfFloors());
            ps.setString(11, facility.getFacilityFree());
            ps.setInt(12, facility.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;

    }
}
