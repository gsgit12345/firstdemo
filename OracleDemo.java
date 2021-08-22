import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:ORCL","HR","HRDB");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from project");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e)
		{ 
				
				System.out.println(e);
				e.printStackTrace();
		
		
		}  
			  
			}  

	}


