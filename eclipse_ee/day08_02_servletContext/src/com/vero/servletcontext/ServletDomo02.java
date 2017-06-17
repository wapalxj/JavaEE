package com.vero.servletcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDomo02
 * http://localhost:8080/day08_02_servletContext/ServletDomo02
 * 
 * ServletContext作为域对象取出设置的数据
 */
@WebServlet("/ServletDomo02")
public class ServletDomo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application=getServletContext();
		String name=(String) application.getAttribute("name");
		if (name==null) {
			response.getWriter().append("-你不能直接访问我-");
		}
		response.getWriter().append(name+"---").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
