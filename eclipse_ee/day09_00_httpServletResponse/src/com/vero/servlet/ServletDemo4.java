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
 * 生成验证码
 */
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//告诉客户端不缓存
		response.setHeader("expires","0");
		response.setHeader("parame","no-cache");
		response.setHeader("cache-control","no-cache");
		//在内存中创建一个图像对象
		int width=110;
		int height=25;
		BufferedImage img=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//创建一个画笔
		Graphics g=img.getGraphics();
		//添加背景色
		g.setColor(Color.PINK);
		g.fillRect(1, 1, width-2, height-2);
		
		//边框颜色
		g.setColor(Color.RED);
		g.drawRect(0, 0, width-1, height-1);
		//设置文本样式
		g.setColor(Color.BLUE);
		g.setFont(new Font("宋体", Font.BOLD|Font.ITALIC, 15));
		//添加文本
		Random rand=new Random();
		String str=rand.nextInt(10)+" "+rand.nextInt(10)+" "+rand.nextInt(10)+" "+rand.nextInt(10);
		g.drawString(str, 20, 18);
		
		//添加9条干扰线
		for (int i = 0; i < 9; i++) {
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		//将图片对象以流的方式输出到客户端
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
