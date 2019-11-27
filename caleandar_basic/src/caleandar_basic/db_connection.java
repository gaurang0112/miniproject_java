package caleandar_basic;
import java.util.*;
import java.sql.*;

public class db_connection  {
	
	    private static final String url = "jdbc:mysql://localhost:3306/calendar";
	 
	    private static final String user = "data";
	 
	    private static final String password = "0000";
//	 
	    public static Connection Connect() throws SQLException 
	    {

//	    	String url = "jdbc:mysql://localhost";
//	    	String user = "data";
//	    	String password = "0000";
//			 
	    	Connection connect =DriverManager.getConnection(url,user,password); 
	    	System.out.println("Connect");
	    		
	    		return connect;
	    		
	    
//	        try {
//	            Connection con = DriverManager.getConnection(url, user, password);
//	            System.out.println("Success");
//	 
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            System.out.println("fail");
//	        }
//	    }
	    
//	    
//	    public static class Disconnect extends db_connection {
//	    	public static void Disconnect() {
//	    		db_connection connect=new db_connection();
//	    		Connection disconnect=connect.close();
//	    			
//	    	}
	    }

	 
	    
	    
	    
	    
	    
	}
	






