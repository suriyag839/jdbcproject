import java.sql.*;
public class hello {
	
	public static void insert() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/sett";
		String username="root";
		String password="Suriya@123";
		String Query="insert into link values(?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1,102);
		pst.setString(2,"bye");
		pst.executeUpdate();
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception{
		
		 
	 insert();
		
	}

}
