package controller;

import model.Customer;
import model.Facility;
import service.IFacilityService;
import service.impl.FacilityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FacilityServlet", urlPatterns = "/facility")
public class FacilityServlet extends HttpServlet {

    private IFacilityService facilityService = new FacilityService();

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
            case "search":
                searchFacility(request, response);
                break;
            default:
        }
    }

    private void searchFacility(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean check = facilityService.remove(id);

        String mess;
        if (check) {
            mess = "DELETE WELL DONE";
        } else {
            mess = "DELETE ERROR";
        }
        request.setAttribute("mess", mess);
        showList(request, response);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        String facilityFree = request.getParameter("facilityFree");
        int id = Integer.parseInt(request.getParameter("id"));
        Facility facility = new Facility(name, area, cost, maxPeople, rentTypeId, facilityTypeId,
                standardRoom, descriptionOtherConvenience, poolArea
                , numberOfFloors, facilityFree, id);
        facilityService.update(id, facility);
        boolean check = facilityService.update(id, facility);
        String mess = "Error create";
        if (check) {
            mess = "Added";
        }
        request.setAttribute("mess", "Edit well done");
        try {
            request.getRequestDispatcher("view/facility/edit-facility.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeId"));
        int facilityTypeId = Integer.parseInt(request.getParameter("facilityTypeId"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloors = Integer.parseInt(request.getParameter("numberOfFloors"));
        String facilityFree = request.getParameter("facilityFree");
        Facility facility = new Facility(name, area, cost, maxPeople, rentTypeId, facilityTypeId, standardRoom, descriptionOtherConvenience, poolArea
                , numberOfFloors, facilityFree);
        boolean check = facilityService.add(facility);
        String mess = null;
        if (check) {
            mess = "Added";
        } else {
            mess = "Error create";
        }

        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/facility/create-villa.jsp").forward(request, response);
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
            case "addVilla":
                showAddFormVilla(request, response);
                break;
            case "addHouse":
                showAddFormHouse(request, response);
                break;
            case "addRoom":
                showAddFormRoom(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showAddFormRoom(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/facility/create-room.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAddFormHouse(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/facility/create-house.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAddFormVilla(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/facility/create-villa.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Facility> facilityList = facilityService.findAll();
        Facility facility = null;
        String str = "";
        for (Facility value : facilityList) {
            if (value.getId() == id) {
                facility = value;
                break;
            }
        }
        request.setAttribute("id", facility.getId());
        request.setAttribute("name", facility.getName());
        request.setAttribute("area", facility.getArea());
        request.setAttribute("cost", facility.getCost());
        request.setAttribute("maxPeople", facility.getMaxPeople());
        request.setAttribute("rentTypeId", facility.getRentTypeId());
        request.setAttribute("facilityTypeId", facility.getFacilityTypeId());
        request.setAttribute("standardRoom", facility.getStandardRoom());
        request.setAttribute("descriptionOtherConvenience", facility.getDescriptionOtherConvenience());
        request.setAttribute("poolArea", facility.getPoolArea());
        request.setAttribute("numberOfFloors", facility.getNumberOfFloors());
        request.setAttribute("facilityFree", facility.getFacilityFree());

        try {
            request.getRequestDispatcher("view/facility/edit-facility.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList = facilityService.findAll();
        request.setAttribute("facilityList", facilityList);
        try {
            request.getRequestDispatcher("view/facility/list-facility.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
