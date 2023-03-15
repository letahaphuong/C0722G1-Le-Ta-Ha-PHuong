package controller;

import model.User;
import service.IUserService;
import service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = "/user")
public class UserServlet extends HttpServlet {

    private IUserService userService =new UserService();

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
            case "remove":
                remove(request,response);
                break;
            case "findByCountry":
                findByCountry(request,response);
                break;

            default:
        }
    }



    private void findByCountry(HttpServletRequest request, HttpServletResponse response) {
        String country=request.getParameter("country");
        List<User> userList=userService.findByCountry(country);
        request.setAttribute("userList",userList);
        try {
            request.getRequestDispatcher("user/search.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
      int id=Integer.parseInt(request.getParameter("id"));
      boolean check=userService.remove(id);
      String mess="Delete Error";
      if (check){
          mess="DELETE WELL DONE";
      }
      request.setAttribute("mess","DELETE WELL DONE");
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String country=request.getParameter("country");

        User user=new User(id,name,email,country);

        userService.update(id,user);

        boolean check=userService.update(id,user);

        String mess="Error Edit";
        if (check){
            mess="Edit well done";
        }
        request.setAttribute("mess","Edit well done");
        try {
            request.getRequestDispatcher("user/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        int id =Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        User user = new User(id,name,email,country);
        boolean check=userService.add(user);
        String mess="Error create";
        if (check){
            mess="Added";
        }

        request.setAttribute("mess","Added");
        try {
            request.getRequestDispatcher("user/create.jsp").forward(request,response);
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
                showInputForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<User> userList=userService.findAll();
        User user = null;
        String str="";
        for (User value:userList){
            if (value.getId()==id){
                user=value;
                break;
            }
        }
        request.setAttribute("id",user.getId());
        request.setAttribute("name",user.getName());
        request.setAttribute("email",user.getEmail());
        request.setAttribute("country",user.getCountry());

        try {
            request.getRequestDispatcher("user/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showInputForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("user/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList=userService.findAll();

        request.setAttribute("userList",userList);
        try {
            request.getRequestDispatcher("user/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
