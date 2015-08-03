package com.sp;

import java.sql.*;


public class TestOra {
public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection ct=DriverManager.getConnection("jdbc:oracle:thin:@10.22.1.118:1521:orcl", "scott", "123456");
		    Statement sm=ct.createStatement();
		    ResultSet rs=sm.executeQuery("select * from emp");
		    while(rs.next()){
		    	System.out.println("ÓÃ»§Ãû £º"+rs.getString(2));
		    }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
}
}
