/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.*;
import java.sql.*;


/**
 *
 * @author demon
 */
public class db_connector {
     private static final String url = "jdbc:mysql://localhost:3306/calendar";
	 
	    private static final String user = "data";
	 
	    private static final String password = "0000";
//	 
	    public static Connection Connect() throws SQLException 
	    {
		 
	    	Connection connect =DriverManager.getConnection(url,user,password); 
	    	System.out.println("Connect");
	    		
	    		return connect;
	    		 
      
                
        
   
}
}