import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class hi {
	
	public static void update() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/sett";
		String username="root";
		String password="Suriya@123";
		String Query="update link set name='hahaha'where id =101";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		 
		pst.executeUpdate();
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception{
		
		 
	 update();
		
	}

}
