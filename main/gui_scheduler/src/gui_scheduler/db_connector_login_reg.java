/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_scheduler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author demon
 */
public class db_connector_login_reg {
    
    private static final String url = "jdbc:mysql://localhost:3306/loginpage";
	 
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