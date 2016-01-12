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
			
			String sql="update Student SET sage= 15 where  sid=1004";
			
			int rs=stmt.executeUpdate(sql);
			
			System.out.println(rs);
		
			stmt.close();
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
}