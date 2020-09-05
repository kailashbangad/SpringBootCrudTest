package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password=request.getParameter("pwd");
		String address=request.getParameter("address");
		int cno=Integer.parseInt(request.getParameter("cno"));
		HttpSession session=request.getSession();
		
		try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:50818;databaseName=BookStore;integratedsecurity=true");
		Statement st =con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into User_Details values(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setInt(3, cno);
		ps.setString(4, address);
		ps.executeUpdate();
		session.setAttribute("cno", cno);
		session.setAttribute("address", address);
		PrintWriter out = response.getWriter();
		out.print("<body bgcolor='gray'><font color='white'><center><h1>Registration Successfull</h1><br></center><a href='login.jsp'>Back to Login</a></font></body>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
