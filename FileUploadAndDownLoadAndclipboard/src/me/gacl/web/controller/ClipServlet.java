package me.gacl.web.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClipServlet
 */
@WebServlet("/ClipServlet")
public class ClipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		String str =request.getParameter("deliver");
		File txt=new File("E:/log1.txt");
	       if(!txt.exists()){ 
	         txt.createNewFile(); 
	      } 
	       byte bytes[]=new byte[512];  
	       bytes=str.getBytes(); 
	       int b=bytes.length;  //是字节的长度，不是字符串的长度
	       FileOutputStream fos=new FileOutputStream(txt); 
	       fos.write(bytes,0,b); 
	       fos.close();

		 System.out.println("servlet:"+str);
		response.sendRedirect("upload.jsp");
	}

}

