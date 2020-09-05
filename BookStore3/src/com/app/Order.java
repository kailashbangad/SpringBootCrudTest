package com.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.stream.IntStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Order
 */
public class Order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order() {
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
		HttpSession session=request.getSession();
		int bookid=(int)session.getAttribute("bookid");
		int qty=(int)session.getAttribute("qty");
		String uname=(String)session.getAttribute("uname");
		int pno=(int)session.getAttribute("pno");
		String address=(String)session.getAttribute("address");
		
		Random rn =new Random();
		int orderid= rn.nextInt(40)+1;
		LocalDate localDate = LocalDate.now();
       
		java.util.Date date= new java.util.Date();
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:50818;databaseName=BookStore;integratedsecurity=true");
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("select * from Books where Book_id="+bookid);
			while(rs.next()){
				String bookname=rs.getString(2);
				String author=rs.getString(3);
			}
//			ResultSet rs1= st.executeQuery("select * from User_Details where username='"+uname+"'");
//			while(rs.next())
//			{
//				 pno=rs.getInt(3);
//				 address=rs.getString(4);
//				
//			}
			PreparedStatement ps=con.prepareStatement("insert into Order_Details values(?,?,?,?,?,?,?)");
			ps.setInt(1,orderid);
			ps.setInt(2,bookid);
			ps.setString(3, uname);
			ps.setInt(4, pno);
			ps.setString(5,address);
			ps.setString(6,DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
			ps.setInt(7, qty);
			ps.executeUpdate();
			request.getRequestDispatcher("Final.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
