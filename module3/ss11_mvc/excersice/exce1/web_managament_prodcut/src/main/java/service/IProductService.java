package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findByID(int id);

    void update(int id, Product product);

    void remove(int id);

    Product findByName(String name);
}