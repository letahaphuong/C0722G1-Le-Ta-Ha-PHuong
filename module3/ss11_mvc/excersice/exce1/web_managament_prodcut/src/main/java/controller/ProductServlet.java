package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {

    private IProductService productService = new ProductService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                save(request, response);
                break;
            case "edit":
                update(request, response);
                break;
            case "remove":
                remove(request, response);
                break;
            case "findProduct":
                showProductById(request,response);
                break;
            default:
        }
    }

    private void remove(HttpServletRequest request, HttpServletResponse response)  {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findByID(id);
        productService.remove(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void update(HttpServletRequest request, HttpServletResponse response)  {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String productDetail = request.getParameter("productDetail");
        String producer = request.getParameter("producer");
        Product product = productService.findByID(id);
        product.setName(name);
        product.setPrice(price);
        product.setProductDetail(productDetail);
        product.setProducer(producer);
        productService.update(id, product);
        request.setAttribute("product", product);
        request.setAttribute("message", "Updated");
        try {
            request.getRequestDispatcher("product/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String productDetail = request.getParameter("productDetail");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, productDetail, producer);
        productService.save(product);
        request.setAttribute("message", "Added");
        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showInputForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "view":
                showDetail(request, response);
                break;

            default:
                showList(request, response);
        }
    }

    private void showProductById(HttpServletRequest request, HttpServletResponse response) {
        String name =request.getParameter("name");
        Product product = productService.findByName(name);
        if (product!=null){
            request.setAttribute("product",product);
            try {
                request.getRequestDispatcher("product/view1.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            request.setAttribute("mess","Name not found");
            try {
                request.getRequestDispatcher("product/view1.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void showDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findByID(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("product/view.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findByID(id);

        if (product == null) {
            request.getRequestDispatcher("product/error-404.jsp").forward(request, response);
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("product/edit.jsp").forward(request, response);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.findAll();
        request.setAttribute("productList", productList);
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }

    private void showInputForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }
}