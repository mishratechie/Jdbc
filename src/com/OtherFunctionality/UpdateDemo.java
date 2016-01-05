package com.OtherFunctionality;

import java.sql.*;
class UpdateDemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:mydsn";
			Connection con=DriverManager.getConnection(url,"rose","rose");
			Statement stmt= con.createStatement();
			//String sql="select * from Student";
			//String sql="insert into Student values( 1004 ,'kiran' , '12/05/1990' , 21 )";
			String sql="update Student SET sage= 15 where  sid=1004";
		//	ResultSet rs=stmt.executeQuery(sql);1
			int rs=stmt.executeUpdate(sql);
			 /*while(rs.next())
			{
				int a1=rs.getInt("sid");
				String a2=rs.getString("sname");
				Date a3=rs.getDate("sdate");
				int a4=rs.getInt("sage");
				System.out.print(" Student Id:"+ a1);
								System.out.print(" Student Name:"+ a2);
												System.out.print(" Student Dob:"+ a3);
																System.out.print(" Student Age:"+ a4);
			}*/
			stmt.close();
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
}