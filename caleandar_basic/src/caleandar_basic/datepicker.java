package caleandar_basic;
import  caleandar_basic.db_connection;


import java.util.*;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;

			
public class datepicker extends db_connection {

	

	public static void main(String[] args) throws SQLException 
	{
		// TODO Auto-generated method stub
//		Calendar c= Calendar.getInstance();
//		Date date0= c.getTime();
//		System.out.println(date0);
//		
//		LocalDate date1=LocalDate.now();
//		System.out.println(date0);
		
//		DateFormat date= new SimpleDateFormat("dd-MM-yyyy");
//		String date2=date1.format(date1);
//		System.out.println(date);
////		
//		Calendar date0=formater.getCalendar();
//	    System.out.println(date);
//	    String date0=date1;
//	    
//		Date date = Calendar.getInstance().getTime();  
//        System.out.println(date);
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
//        String date1 = dateFormat.format(date);  
//        System.out.println(date1);
		
		
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
////	date.setTimeZone(java.util.TimeZone.getTimeZone("GMT-4"));
//		Date date=new Date();
//	
//		String date1=formatter.format(date);
//	
//		System.out.println(date1);
//	    
//		db_connection con=new db_connection();
//		con.Connect();
//		
//		 db_connection conn=new db_connection();
//		db_connection.Conn();
		
		long millis=System.currentTimeMillis();  
		java.sql.Date date1=new java.sql.Date(millis);  
		System.out.println(date1);  
		
		Statement stmt = db_connection.Connect().createStatement(); 
		stmt.executeQuery("use calendar");

		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter your choise \n 1.)java \n 2.)os \n 3.)cg \n 4.)daa \n ");
		
		int subject_name=scanner.nextInt();
		
		switch (subject_name)
		{
		case 1 :
			
			
			System.out.println("enter 1 for Class schedule 0 for not");
			int j0=scanner.nextInt();
			if(j0==1)
				{
//				try {
//					//normal jdbc query
////					String java="insert into classes (date,class,schedule)values("+date1+",'java','+j0+')";
//					//query from phpmyadmin
//					String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','java',"+j0+")";
//					int x=stmt.executeUpdate(java);
//				}
//				catch (Exception e) {
//					System.out.println(e);
//					}
					
				
				String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','java',"+j0+")";
				int x=stmt.executeUpdate(java);
					if(x>0) {
						System.out.println("Ok");
						System.out.println("Class schedule,Database_Updated");
					}
					else {
						System.out.println("Error");
						break;
					}
						
					
				}
			else
				{
				String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','java',"+j0+")";
				int x=stmt.executeUpdate(java);
				if(x>0) {
					System.out.println("Ok");
					System.out.println("Class not schedule,Database_Updated");
					break;
				}
				else {
					System.out.println("Error");
					break;
				
				}
			
				}
			break;
			
		case 2 :
			
			System.out.println("enter 1 for Class schedule 0 for not");
			int j1=scanner.nextInt();
			if(j1==1)
				{
				
				String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','os',"+j1+")";
				int x=stmt.executeUpdate(java);
					if(x>0) {
						System.out.println("Ok");
						System.out.println("Class schedule,Database_Updated");
					}
					else {
						System.out.println("Error");
						break;
					}
					
				}
			else
			{
				String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','java',"+j1+")";
				int x=stmt.executeUpdate(java);
				if(x>0) {
					System.out.println("Ok");
					System.out.println("Class not schedule,Database_Updated");
					break;
				}
				else {
					System.out.println("Error");
					break;
				
				}
				
			}
			break;
		
		
		
		case 3 :
		
		System.out.println("enter 1 for class schedule 0 for not");
		int j2=scanner.nextInt();
		if(j2==1)
			{
			
			String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','gc',"+j2+")";
			int x=stmt.executeUpdate(java);
				if(x>0) {
					System.out.println("Ok");
					System.out.println("Class schedule,Database_Updated");
					break;
					}

				else {
					System.out.println("Error");
					break;
				}
			}
		else
		{
			String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','java',"+j2+")";
			int x=stmt.executeUpdate(java);
			if(x>0) {
				System.out.println("Ok");
				System.out.println("Class not schedule,Database_Updated");
				break;
			}
			else {
				System.out.println("Error");
				break;
			
			}
		}
			
		
		case 4 :
		
		System.out.println("enter 1 for class schedule 0 for not");
		int j3=scanner.nextInt();
		if(j3==1)
			{
			
			String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','daa',"+j3+")";
			int x=stmt.executeUpdate(java);
				if(x>0) {
					System.out.println("Ok");
					System.out.println("Class schedule,Database_Updated");
				}
				else {
					System.out.println("Error");
					break;
					}
			}
			else
			{
				String java="INSERT INTO `classes`(`date`, `class`, `schedule`) VALUES ('"+date1+"','java',"+j3+")";
				int x=stmt.executeUpdate(java);
				if(x>0) {
					System.out.println("Ok");
					System.out.println("Class not schedule,Database_Updated");
					break;
				}
				else {
					System.out.println("Error");
					break;
				
				}
			}
		
			
		break;
		
		
		
		
		default :
			System.out.println("Worng_choice");
			
		}//end of Switch_Case
		
		
		
		
		
//		try {
//			Connection 
//			 System.out.println("Success");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			 System.out.println("fail");
//			 
//			
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter date");
		
//		String date =sc.next();
		
		
	}	
	
}

