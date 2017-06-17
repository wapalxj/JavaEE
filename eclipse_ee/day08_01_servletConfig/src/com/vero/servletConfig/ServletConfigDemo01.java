package com.vero.servletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo01
 */
@WebServlet("/ServletConfigDemo01")
public class ServletConfigDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.config=config;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取配置文件中的信息第一种方式
		String encoding=config.getInitParameter("encoding");
		//第二种方式
		encoding=getServletConfig().getInitParameter("encoding");
		//第三种方式
		encoding=getInitParameter("encoding");
		System.out.println(encoding);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
