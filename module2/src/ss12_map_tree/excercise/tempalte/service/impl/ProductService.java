package ss12_map_tree.excercise.tempalte.service.impl;

import ss12_map_tree.excercise.tempalte.controller.ProductController;
import ss12_map_tree.excercise.tempalte.model.Product;
import ss12_map_tree.excercise.tempalte.service.IProductService;

import java.util.*;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new LinkedList<>();


    public static void temp() {
        Product product = new Product("1", "ip", 10);
        Product product1 = new Product("2", "nokia", 15);
        Product product2 = new Product("3", "xiaomi", 11);
        Product product3 = new Product("4", "ss", 12);
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    public Product infoProduct() {
        System.out.println("Mời bạn nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, price);
        return product;
    }

    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công: ");
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập id sản phẩm bạn muốn sửa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getId())) {
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                productList.get(i).setName(name);
                System.out.println("Nhập giá mới: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setPrice(price);
                System.out.println("Sửa thành công!");
            }
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập mã sản phẩm bạn muốn xoá: ");
        String removeProduct = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (removeProduct.equals(productList.get(i).getId())) {
                System.out.println("Bạn có chắc chắn muốn xoá?" +
                        "y => Xoá" +
                        "N => No");
                String delete = scanner.nextLine();
                if (delete.equals("y")) {
                    productList.remove(productList.get(i));
                    System.out.println("Xoá thành công!");
                }
            }
        }
    }


    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void findProduct() {
        System.out.println("Nhập tên sản phẩm bạn cần tìm: ");
        String findName = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (findName.contains(productList.get(i).getName())) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void sortUpPrice() {
        System.out.println("Sau khi sắp xếp tăng dần!");
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Product product:productList){
            System.out.println(product);
        }
    }

    @Override
    public void sortDownPrice() {
        System.out.println("Sau khi sắp xếp giảm dần!");
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        this.displayProduct();

    }


}
