import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CaculatorServlet",value = "/caculate")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperator=Float.parseFloat(request.getParameter("first"));
        float secondOperator=Float.parseFloat(request.getParameter("second"));
        String match=request.getParameter("macth");

        Calculator calculator=new Calculator(firstOperator,secondOperator,match);

        request.setAttribute("calculator",calculator);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }
}
