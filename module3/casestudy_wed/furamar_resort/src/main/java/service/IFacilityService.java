package service;

import model.Customer;
import model.Facility;

import java.util.List;

public interface IFacilityService {
    boolean add(Facility facility);

    List<Facility> search(String search);

    List<Facility> findAll();

    boolean remove(int id);

    boolean update(int id,Facility facility);
}
