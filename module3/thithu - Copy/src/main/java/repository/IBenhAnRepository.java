package repository;

import model.BenhAn;

import java.util.List;

public interface IBenhAnRepository {
    List<BenhAn> findAll();

    boolean edit(String id, BenhAn benhAn);

    boolean remove(String id);
}
