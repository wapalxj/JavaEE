package com.vero.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo1
 * 
 * http://localhost:8080/day09_00_httpServletResponse/ServletDemo1
 * 
 */
@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.告诉服务器用UTF-8解析文本
//		response.setCharacterEncoding("UTF-8");
//		//2.告诉客户端用什么编码
//		response.setHeader("content-type", "text/html;charset=UTF-8");
		
		//3.上面1,2两件事同时做
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		//向客户端响应文本内容
		out.write("哈哈");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
