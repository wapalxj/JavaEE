package com.vero.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.OutputBuffer;

/**
 * Servlet implementation class ServletDemo3
 * http://localhost:8080/day09_00_httpServletResponse/ServletDemo3
 * 图片的下载
 */
@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//通过路径得到输入流
		String path=getServletContext().getRealPath("/WEB-INF/classes/美女.jpg");
		FileInputStream fis=new FileInputStream(path);
		//创建输出流
		ServletOutputStream sos=response.getOutputStream();
		//得到文件名
		String filename=path.substring(path.lastIndexOf("\\")+1);
		//设置文件编码
		filename=URLEncoder.encode(filename, "utf-8");
		//告知客户端是下载文件
		response.setHeader("content-disposition", "attachment;filename="+filename);
		response.setHeader("content-type", "image/jpeg");
		//输出
		int len=1;
		byte[] b=new byte[1024];
		while ((len=fis.read(b))!=-1) {
			sos.write(b,0,len);
		}
		sos.close();
		fis.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
