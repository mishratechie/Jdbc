package com.OtherFunctionality;

import java.sql.*;
import java.util.*;

class PropertyConnection
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String url="jdbc:odbc:mydsn1";
			
			Properties p=new Properties();
			p.put("user", "Rohit");
			p.put("password","Kumar");
			
			Connection con=DriverManager.getConnection(url,p);
			
			System.out.print("Connection Established....");

			Statement stmt= con.createStatement();
			
//			String sql="insert into Employee values(1005,"Kirti",15000,"Manager")'';

			
//			ResultSet rs=stmt.executeUpdate(sql);
			/*while(rs.next())
			{
				int a1=rs.getInt("eid");
				String a2=rs.getString("ename");
				int a3=rs.getInt("esal");
				String a4=rs.getString("edesg");
				System.out.print(" Student Id:"+ a1);
								System.out.print(" Student Name:"+ a2);
												System.out.print(" Student Dob:"+ a3);
																System.out.print(" Student Age:"+ a4);
			}
*/			stmt.close();
			con.close(); 
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
}