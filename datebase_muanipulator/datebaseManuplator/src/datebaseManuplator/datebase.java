package datebaseManuplator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

import datebaseManuplator.datebaseConnection;
public class datebase  extends datebaseConnection {

	public static void main(String[] args) throws SQLException{
		
		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter sql query");
		
		
		Statement st=datebaseConnection.Connect().createStatement();
		st.executeQuery("use calendar");
		
		
		
		System.out.println("1.)show all data\n2.)show data only scheduled classes\n3.)show data only not schduled classes\n4.)show only java classes\n5.)show only operating system classes\n6.)show only daa classes\n7.)show only computer graphic classes");
		int x=scanner.nextInt();
		if (x==1) {
			String query="select * from classes ";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
			}
		else if (x==2)
		{
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
		
		else if(x==3) {
			String query="SELECT * FROM `classes` WHERE schedule=0";
			ResultSet rs=st.executeQuery(query);
			while (rs.next())
			{
				Date dateofschedule=rs.getDate("date");
				String classs=rs.getString("class");
				int schedule=rs.getInt("schedule");
				System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
			}
			
		}
		
		else if (x==4) {
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
		
		else if (x==5) {
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
		
			
		
		else if (x==6) {
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
		
		else if (x==7) {
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
		
		
		
		
		else {
			System.out.println("wrong choice");
		}
		
		st.close();
//		String query=scanner.nextLine();
	    
//	Statement st=datebaseConnection.Connect().createStatement();
//	st.executeQuery("use calendar");
//	
//	
//	ResultSet rs=st.executeQuery(query);
//	while (rs.next())
//	{
//		Date dateofschedule=rs.getDate("date");
//		String classs=rs.getString("class");
//		int schedule=rs.getInt("schedule");
//		System.out.format("%s, %s, %s\n", dateofschedule , classs, schedule);
//	}
//	st.close();
	
//	rs.getString(0);
////	String date=rs.getString();
//	System.out.println(rs);
//	

	}

}
