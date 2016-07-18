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
 */
@WebServlet(name = "TestServlet3",urlPatterns = "/TestServlet3")
public class TestServlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =null;
        try {
            out =response.getWriter();
            String loginName=request.getParameter("loginName");
            String loginPassword=request.getParameter("loginPassword");
            out.println("<h1>POST---TestServlet3</h1>");

            out.println("loginName----->"+loginName);
            out.println("loginPassword----->"+loginPassword);
        }finally {
            if (out!=null)
                out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =null;
        try {
            out =response.getWriter();
            String loginName=request.getParameter("loginName");
            String loginPassword=request.getParameter("loginPassword");
            out.println("<h1>GET---TestServlet3</h1>");

            //回话对象:获取信息
            if (loginName==null){
                HttpSession session=request.getSession();
                loginName= (String) session.getAttribute("name");
                loginPassword= (String) session.getAttribute("pwd");
            }

            out.println("loginName----->"+loginName);
            out.println("loginPassword----->"+loginPassword);
        }finally {
            if (out!=null)
                out.close();
        }
    }
}
