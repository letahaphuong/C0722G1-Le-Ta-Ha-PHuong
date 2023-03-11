package service.impl;

import model.Facility;
import repository.IFacilityRepository;
import repository.impl.FacilityRepository;
import service.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    private IFacilityRepository facilityRepository=new FacilityRepository();

    @Override
    public boolean add(Facility facility) {
        return facilityRepository.add(facility);
    }

    @Override
    public List<Facility> search(String search) {
        return facilityRepository.search(search);
    }

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }

    @Override
    public boolean remove(int id) {
        return facilityRepository.remove(id);
    }

    @Override
    public boolean update(int id, Facility facility) {
        return facilityRepository.update(id,facility);
    }
}
