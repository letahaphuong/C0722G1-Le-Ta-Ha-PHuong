package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    private ICustomerService customerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
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
            case "search":
                searchCustomer(request, response);
                break;
            default:
        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        List<Customer> customerList = customerService.findCustomer(search);
        request.setAttribute("customerList", customerList);
        request.setAttribute("search", search);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean check = customerService.remove(id);
        String mess;
        if (check) {
            mess = "DELETE WELL DONE";
        } else {
            mess = "Delete Error";
        }
        request.setAttribute("mess", mess);
        showList(request, response);

    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customerTypeId = Integer.parseInt(request.getParameter("customerType"));
//        String nameCustomerType = request.getParameter("nameCustomerType");
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("birthDay");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("getIdCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(customerTypeId, name, dateOfBirth, gender, idCard, phoneNumber, email, address, id);
        boolean check = customerService.add(customer);
        String mess;
        if (check) {
            mess = "Added";
        } else {
            mess = "Error create";
        }

        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void update(HttpServletRequest request, HttpServletResponse response) {

        int customerTypeId = Integer.parseInt((request.getParameter("customerTypeId")));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("birthDay");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("getIdCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id = Integer.parseInt(request.getParameter("id"));

        Customer customer = new Customer(customerTypeId, name, dateOfBirth, gender, idCard, phoneNumber, email, address, id);

        customerService.update(id, customer);

        boolean check = customerService.update(id, customer);

        String mess;
        if (!check) {
            mess = "Edit well done";
        } else {
            mess = "Error Edit";
        }
        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/customer/edit-customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showAddForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Customer> customerList = customerService.findAll();
        Customer customer = null;
        String str = "";
        for (Customer value : customerList) {
            if (value.getId() == id) {
                customer = value;
                break;
            }
        }
        request.setAttribute("id", customer.getId());
        request.setAttribute("customerTypeId", customer.getCustomerTypeId());
        request.setAttribute("name", customer.getName());
        request.setAttribute("dateOfBirth", customer.getDateOfBirth());
        request.setAttribute("gender", customer.isGender());
        request.setAttribute("idCard", customer.getIdCard());
        request.setAttribute("phoneNumber", customer.getPhoneNumber());
        request.setAttribute("email", customer.getEmail());
        request.setAttribute("address", customer.getAddress());

        try {
            request.getRequestDispatcher("view/customer/edit-customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
