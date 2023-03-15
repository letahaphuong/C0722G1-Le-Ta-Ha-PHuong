package controller;

import model.BenhAn;
import service.IBenhAnService;
import service.impl.BenhAnService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BenhAnServlet", urlPatterns = "/benhAn")
public class BenhAnServlet extends HttpServlet {
    IBenhAnService benhAnService = new BenhAnService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                break;
            case "remove":
                remove(request,response);
                break;
            default:

        }
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        boolean check=benhAnService.remove(id);
        String mess=null;
        if (check){
            mess="Xoá Thành công";
        }else {
            mess="Xoá không thành công";
        }
        request.setAttribute("mess",mess);
        showList(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showFormEdit(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        String idBenhAn =request.getParameter("idBenhAn");
        List<BenhAn>benhAnList=benhAnService.findAll();
        BenhAn benhAn=null;
        String str="";
        for (BenhAn value:benhAnList){
            if (value.getIdBenhAn()==idBenhAn){
                benhAn=value;
                break;
            }
        }
        request.setAttribute("idBenhAn",benhAn.getIdBenhAn());
        request.setAttribute("idBenhNhan",benhAn.getIdBenhNhan());
        request.setAttribute("name",benhAn.getName());
        request.setAttribute("ngayNhap",benhAn.getNgayNhap());
        request.setAttribute("ngayRa",benhAn.getNgayRa());
        request.setAttribute("lyDo",benhAn.getLyDo());
        request.setAttribute("phuongPhapDieuTri",benhAn.getPhuongPhapDieuTri());
        request.setAttribute("bacSi",benhAn.getBacSi());
        try {
            request.getRequestDispatcher("/view/jsp/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<BenhAn> benhAnList=benhAnService.findAll();
        request.setAttribute("benhAnList",benhAnList);
        try {
            request.getRequestDispatcher("view/jsp/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
