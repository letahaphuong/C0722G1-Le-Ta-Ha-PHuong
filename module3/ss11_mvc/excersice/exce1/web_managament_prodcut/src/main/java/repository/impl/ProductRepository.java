package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Bút", 5000, "Bút bi", "Thiên Long"));
        productList.add(new Product(2, "Thước", 3000, "20 cm", "ABC"));
        productList.add(new Product(3, "vở", 4000, "vở mỏng", "Tan Vinh"));
        productList.add(new Product(4, "bình nước", 10000, "20 lit", "Thuý"));
        productList.add(new Product(5, "kẹo", 20000, "Kẹo sâm", "Korea"));
    }


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByID(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)){
               return productList.get(i);
            }
        }
        return null;
    }
}