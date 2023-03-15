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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService customerService=new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                save(request,response);
                break;
            case "edit":
            update(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "searchId":
                searchId(request,response);
                break;
            default:
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String startDate = request.getParameter("startDate");
        int rentTypeId= Integer.parseInt(request.getParameter("rentTypeId"));
        String note = request.getParameter("note");
        int id= Integer.parseInt(request.getParameter("id"));

        Customer customer = new Customer(name,phoneNumber,startDate,rentTypeId,note,id);

        customerService.edit(id, customer);

        boolean check = customerService.edit(id, customer);

        String mess;
        if (check) {
            mess = "Sửa thành công";
        } else {
            mess = "Sửa Không thành công";
        }
        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchId(HttpServletRequest request, HttpServletResponse response) {
        int search = Integer.parseInt(request.getParameter("searchById"));
        List<Customer> customerList = customerService.searchById(search);
        request.setAttribute("searchById", search);
        request.setAttribute("customerList", customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        List<Customer> customerList = customerService.searchCustomer(search);
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

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean check = customerService.remove(id);
        String mess=null;
        if (check) {
            mess = "Xoá Thành công";
        }else {
            mess = "Xoá không Thành công";
        }
        request.setAttribute("mess", mess);
        showList(request, response);
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String startDate = request.getParameter("startDate");
        int rentId= Integer.parseInt(request.getParameter("rentId"));
        String note = request.getParameter("note");
        Customer customer = new Customer(name,phoneNumber,startDate,rentId,note);
        boolean check = customerService.add(customer);
        String mess="Thêm mới không thành công";
        if (check) {
            mess = "Thêm mới thành công";
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        request.setAttribute("name", customer.getName());
        request.setAttribute("phoneNumber", customer.getPhoneNumber());
        request.setAttribute("startDate", customer.getStartDate());
        request.setAttribute("rentTypeId", customer.getRentTypeId());
        request.setAttribute("note", customer.getNote());


        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList=customerService.findAll();
        request.setAttribute("customerList",customerList);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
