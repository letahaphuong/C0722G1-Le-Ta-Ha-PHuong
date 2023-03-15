import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet ",value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product=request.getParameter("product");
        float listPrice=Float.parseFloat(request.getParameter("price"));
        float discountPercent=Float.parseFloat(request.getParameter("discount"));

        float discountMount=listPrice*discountPercent*0.01f;
        float discountPrice= listPrice-discountMount;
        request.setAttribute("result1",discountPrice);
        request.setAttribute("result",discountMount);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
