package ss17_io_serialization_file_binary.excersice.ex1.service.impl;

import ss17_io_serialization_file_binary.excersice.ex1.model.ProductManagement;
import ss17_io_serialization_file_binary.excersice.ex1.service.IProductManagementService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementService implements IProductManagementService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<ProductManagement> productManagementList = new ArrayList<>();
    private static int id;
    private static String name;
    private static String production;
    private static int price;
    private static String note;

    @Override
    public void addProduction() {
        if (getDataFromFile() != null) {
            productManagementList = getDataFromFile();
        }
        ProductManagement productManagement = this.infoProduct();
        productManagementList.add(productManagement);
        System.out.println("Nhập mới thành công");
        writeFile(productManagementList);
    }


    @Override
    public void showProduction() throws IOException {

        if (getDataFromFile() != null) {
            productManagementList = getDataFromFile();
        }
        for (ProductManagement productManagement : productManagementList) {
            System.out.println(productManagement);
        }
    }

    @Override
    public void findProduction() throws IOException {
        if (getDataFromFile() != null) {
            productManagementList = getDataFromFile();
        }
        System.out.println("Nhập tên sản phẩm bạn cần tim: ");
        String findName = scanner.nextLine();
        boolean flagFind = false;
        for (int i = 0; i < productManagementList.size(); i++) {
            if (productManagementList.get(i).getName().contains(findName)) {
                System.out.println(productManagementList.get(i));
                flagFind = true;
            }

            if (!flagFind) {
                System.out.println("KHông tìm thấy tên!");
            }
        }
    }



    public ProductManagement infoProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        production = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập các mô tả khác: ");
        note = scanner.nextLine();
        ProductManagement productManagement = new ProductManagement(id, name, production, price, note);
        return productManagement;

    }

    public List<ProductManagement> getDataFromFile() {
        List<ProductManagement> productList = new ArrayList<>();
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\ss17_io_serialization_file_binary\\excersice\\data\\list_product.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<ProductManagement>) objectInputStream.readObject();
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
        try {
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public void writeFile(List<ProductManagement> productManagementList) {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_io_serialization_file_binary\\excersice\\data\\list_product.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productManagementList);
        } catch (Exception e) {
            e.getStackTrace();
            return;
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
