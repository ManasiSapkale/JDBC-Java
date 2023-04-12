package com.studentMs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class addstudent {

	public static void main( String[] args ) throws Exception
    {

    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/StudentMs";
    	String username="root";
    	String password="Manasi@06";
    	Connection ms=DriverManager.getConnection(url,username,password);
    	
    	int sno=48;
    	String sname="Tinu";
    	String sclass="MA";
    	int smarks=999;
    	String query="insert into StudentMs values(?,?,?,?)";
    	
    	PreparedStatement pst=ms.prepareStatement(query);
    	pst.setInt(1, sno);
    	pst.setString(2, sname);
    	pst.setString(3, sclass);
    	pst.setInt(4, smarks);
    	
    	int count=pst.executeUpdate();
    	System.out.println(count+" row(s) effected");
    }	
}