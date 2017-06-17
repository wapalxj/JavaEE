import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/9.
 * http://localhost:8080/vero/Servlet_vero?loginName=vero&loginPassword=123456
 * http://127.0.0.1:8080/vero/Servlet_vero?loginName=vero&loginPassword=123456
 */
@WebServlet(name = "Servlet_vero",urlPatterns = "/Servlet_vero")//注解代替web.xml配置<servlet-mapping>(servlet的url-pattern)
public class veroServer extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("----doPost");
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("----doGet");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");



        String loginName=request.getParameter("loginName");
        String loginPassword=request.getParameter("loginPassword");

        System.out.println("用户名:"+loginName);
        System.out.println("密码:"+loginPassword);


        PrintWriter out =null;

        try {
            out =response.getWriter();

            if (loginName.equals("vero")&&loginPassword.equals("123456")){
                out.print("验证成功vero_success");
            }else{
                out.print("验证失败vero_failed");
            }
        }finally {
            if (out!=null)
                out.close();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy()");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init()");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service()");
    }
}
