package com.studentMs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class addnewstudent {

	public static void main( String[] args ) throws Exception
    {
		//TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/studentMs";
    	String username="root";
    	String password="Manasi@06";
    	Connection ms=DriverManager.getConnection(url,username,password);
    	
    	System.out.println("*******Add Your NEW STD to DB*******");
    	System.out.println("Enter sr no");
    	int sno=scan.nextInt();
    	System.out.println("Enter Name");
    	scan.nextLine();
    	String sname=scan.nextLine();
    	System.out.println("Enter class");
    	String sclass=scan.next();
    	System.out.println("Enter marks");
    	int smarks=scan.nextInt();
  
    	
    	String query="insert into studentMs values(?,?,?,?)";
    	
    	PreparedStatement pst=ms.prepareStatement(query);
    	pst.setInt(1, sno);
    	pst.setString(2, sname);
    	pst.setString(3, sclass);
    	pst.setInt(4, smarks);
    	
    	int count=pst.executeUpdate();
    	System.out.println(count+" row(s) effected");
    	ms.close();
    	scan.close();
    }	
	
}
