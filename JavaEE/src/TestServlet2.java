import javax.net.ssl.SNIHostName;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/10.
 * http://localhost:8080/vero/TestServlet2
 * http://127.0.0.1:8080/vero/TestServlet2
 */
@WebServlet(name = "TestServlet2" ,urlPatterns = "/TestServlet2")
public class TestServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("----doPost");
        request.setCharacterEncoding("UTF-8");
        String loginName=request.getParameter("loginName");
        String loginPassword=request.getParameter("loginPassword");
        System.out.println("TestServlet2-----"+loginName+"---------->"+loginPassword);

        //回话对象:保存信息
        HttpSession session=request.getSession();
        session.setAttribute("name",loginName);
        session.setAttribute("pwd",loginPassword);


        //页面跳转

        //方式1:
        response.sendRedirect("TestServlet3");
        //方式2：
//        RequestDispatcher rd=request.getRequestDispatcher("TestServlet3");
//        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("----doGet");
        request.setCharacterEncoding("UTF-8");
        String loginName=request.getParameter("loginName");
        String loginPassword=request.getParameter("loginPassword");
        System.out.println("TestServlet2-----"+loginName+"---------->"+loginPassword);

        //页面跳转
        //方式1:
//        response.sendRedirect("TestServlet3");
        //方式2：
        RequestDispatcher rd=request.getRequestDispatcher("TestServlet3");
        rd.forward(request,response);
    }
}
