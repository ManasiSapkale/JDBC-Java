package com.jdbcsapmle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class addmobile {

	public static void main( String[] args ) throws Exception
    {

    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/Sample";
    	String username="root";
    	String password="Manasi@06";
    	Connection ms=DriverManager.getConnection(url,username,password);
    	
    	int mid=9;
    	String mname="Pixel 11";
    	int mprice=5200;
    	String query="insert into mobile values(?,?,?)";
    	
    	PreparedStatement pst=ms.prepareStatement(query);
    	pst.setInt(1, mid);
    	pst.setString(2, mname);
    	pst.setInt(3, mprice);
    	
    	int count=pst.executeUpdate();
    	System.out.println(count+" row(s) effected");
    }	
}