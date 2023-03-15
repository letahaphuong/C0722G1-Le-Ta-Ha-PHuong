package service.impl;

import model.BenhAn;
import repository.IBenhAnRepository;
import repository.impl.BenhAnRepository;
import service.IBenhAnService;

import java.util.List;

public class BenhAnService implements IBenhAnService {
    IBenhAnRepository benhAnRepository=new BenhAnRepository();
    @Override
    public List<BenhAn> findAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public boolean edit(String id, BenhAn benhAn) {
        return benhAnRepository.edit(id, benhAn);
    }

    @Override
    public boolean remove(String id) {
        return benhAnRepository.remove(id);
    }
}
