/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import gui.db_connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import gui.gui;

/**
 *
 * @author demon
 */
public class query {

    /**
     *
     */
   
    public static void  showalldata()throws SQLException{
//        try{
            
        
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="select * from classes ";
			ResultSet rs=st.executeQuery(query);
//                        DefaultTableModle tm=(DefaultTableModle)jTable1.getMode();
			while (rs.next())
			{
                            
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
                        	int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
        
//    }
//    catch{
        
    
    
//    }
        
    }
    
     public static void  showdataonlyscheduledclasses()throws SQLException{
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="SELECT * FROM `classes` where schedule=1";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
    }
     
      public static void  showdataonlynotschduledclasses()throws SQLException{
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="SELECT * FROM `classes` where schedule=0";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
    }
     
      public static void  showonlyjavaclasses()throws SQLException{
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="select * from classes where class='java'";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
    }
      
      
      
       public static void  showonlyoperatingsystemclasses()throws SQLException{
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="select * from classes where class='os'";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
    }
       
       
       
        public static void  showonlydaaclasses()throws SQLException{
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="select * from classes where class='daa'";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
    }
        
        
        
         public static void  showonlycomputergraphicclasses()throws SQLException{
         Statement st=db_connector.Connect().createStatement();
		st.executeQuery("use calendar");
        String query="select * from classes where class='gc'";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
    }
         
         
         
     
     
    
   
}
