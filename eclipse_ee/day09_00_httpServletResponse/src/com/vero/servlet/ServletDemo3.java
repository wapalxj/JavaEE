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
 * ͼƬ������
 */
@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ͨ��·���õ�������
		String path=getServletContext().getRealPath("/WEB-INF/classes/��Ů.jpg");
		FileInputStream fis=new FileInputStream(path);
		//���������
		ServletOutputStream sos=response.getOutputStream();
		//�õ��ļ���
		String filename=path.substring(path.lastIndexOf("\\")+1);
		//�����ļ�����
		filename=URLEncoder.encode(filename, "utf-8");
		//��֪�ͻ����������ļ�
		response.setHeader("content-disposition", "attachment;filename="+filename);
		response.setHeader("content-type", "image/jpeg");
		//���
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