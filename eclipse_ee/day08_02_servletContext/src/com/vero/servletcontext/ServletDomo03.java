package com.vero.servletcontext;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDomo03
 * 
 * http://localhost:8080/day08_02_servletContext/ServletDomo03
 * 
 * ServletContext获取全局配置信息
 */
@WebServlet("/ServletDomo03")
public class ServletDomo03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletDomo03() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String encoding=getServletContext().getInitParameter("encoding");
		
		response.getWriter().append("encoding  :"+encoding+"   ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
