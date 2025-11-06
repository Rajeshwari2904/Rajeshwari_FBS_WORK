package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: Load the Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//protocol:subprotocol:DB- Specific information
			//jdbc:mysql:
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root", "Rajeshwari@1234");
			 
			String query = "Select * from aircraft_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1)+ " "+ rs.getString(2));
			}
			//System.out.println(rs.getString(1));
			

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}  
// Resultset MetaDATA------>>>>Explore

// There is a built in component row set jo use karne pe disconnected data milta hai....connected architecture
// A RowSet is a powerful and flexible extension of the standard java.sql.ResultSet interface, designed to provide a more adaptable and component-based approach to handling tabular data, particularly in a disconnected environment. It is part of the javax.sql package and was introduced to support component models like JavaBeans

