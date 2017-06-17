package com.vero.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo4
 * http://localhost:8080/day09_00_httpServletResponse/ServletDemo4
 * ������֤��
 */
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���߿ͻ��˲�����
		response.setHeader("expires","0");
		response.setHeader("parame","no-cache");
		response.setHeader("cache-control","no-cache");
		//���ڴ��д���һ��ͼ�����
		int width=110;
		int height=25;
		BufferedImage img=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//����һ������
		Graphics g=img.getGraphics();
		//���ӱ���ɫ
		g.setColor(Color.PINK);
		g.fillRect(1, 1, width-2, height-2);
		
		//�߿���ɫ
		g.setColor(Color.RED);
		g.drawRect(0, 0, width-1, height-1);
		//�����ı���ʽ
		g.setColor(Color.BLUE);
		g.setFont(new Font("����", Font.BOLD|Font.ITALIC, 15));
		//�����ı�
		Random rand=new Random();
		String str=rand.nextInt(10)+" "+rand.nextInt(10)+" "+rand.nextInt(10)+" "+rand.nextInt(10);
		g.drawString(str, 20, 18);
		
		//����9��������
		for (int i = 0; i < 9; i++) {
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		//��ͼƬ���������ķ�ʽ������ͻ���
		ImageIO.write(img, "jpg", response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}