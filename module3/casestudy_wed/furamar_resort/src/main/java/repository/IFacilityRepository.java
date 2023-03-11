package repository;

import model.Facility;

import java.util.List;

public interface IFacilityRepository {
    boolean add(Facility facility);

    List<Facility> search(String search);


    List<Facility> findAll();

    boolean remove(int id);

    boolean update(int id,Facility facility);
}
