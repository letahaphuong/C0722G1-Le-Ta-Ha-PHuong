package service;

import model.BenhAn;

import java.util.List;

public interface IBenhAnService {
    List<BenhAn> findAll();

    boolean edit(String id, BenhAn benhAn);

    boolean remove(String id);
}
