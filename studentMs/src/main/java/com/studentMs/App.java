package com.studentMs;

//importing package
import java.sql.*;

/**
 * JDBC PROGRAM BY #manasi
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

    	//load and register driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//create the object to get Connection
    	//url to db,username,password
    	String url="jdbc:mysql://localhost:3306/studentMs";
    	String username="root";
    	String password="Manasi@06";
    	
    	//get connection to the db
    	Connection ms=DriverManager.getConnection(url,username,password);
    	//a statement to execute a query
    	Statement st=ms.createStatement();
    	//execution of query and storing the response in resultset rs
    	ResultSet rs=st.executeQuery("select * from studentMs");
    	//checking for reponse
    	System.out.println("sno\tsname\tsclass\tsmarks\n");
    	while(rs.next())
    	{
    		String studentMsdata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4);
    		
    		System.out.println(studentMsdata);
    	//reading the student name from response

    	//printing student name
    	}
    	//closing the connection
    	
    	ms.close();
    }
}