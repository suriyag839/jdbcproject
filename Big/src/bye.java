import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class bye {
	

	public static void update() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/sett";
		String username="root";
		String password="Suriya@123";
		String Query="select* from link";
		Connection con=DriverManager.getConnection(url,username,password);
		 Statement st=con.createStatement();
		 ResultSet rst= st.executeQuery(Query);
		 while (rst.next()) {
			 System.out.println(rst.getInt(1));
			 System.out.println(rst.getString(2));
		 }
		 
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception{
		
		 
	 update();
		
	}
		
	

}
