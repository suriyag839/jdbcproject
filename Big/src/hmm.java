import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class hmm {

	public static void delete() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/sett";
		String username="root";
		String password="Suriya@123";
		String Query="delete from link where id =102";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		 
		pst.executeUpdate();
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception{
		
		 
	 delete();
		
	}

}

