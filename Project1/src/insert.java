


import java.sql.*;
import java.util.Scanner;

public class insert {
	
	public static void insertdata()throws Exception {
		
		String url ="jdbc:mysql://127.0.0.1:3306/project";
		String username = "root";
		String password = "Suriya@123";
		String Query = "insert into details(UserId,FullName,Email,enterPassword,Age,Gender,Height,Weight,Activelevel,DateofBirth ,Contactnumber)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(Query);
			
			Scanner obj = new Scanner(System.in);
			
			 int userId;
	            while (true) {
	                System.out.println("Enter User ID : ");
	                userId = Integer.parseInt(obj.nextLine());
	                if (userId > 0) break;
	                System.out.println("Invalid User ID. Must be a positive integer.");
	            }
	            
	            System.out.println("Enter Full Name: ");
	            String fullName = obj.nextLine().trim();
	            while (fullName.isEmpty()) {
	                System.out.println("Full Name cannot be empty. Enter again: ");
	                fullName = obj.nextLine().trim();
	            }
	            
	            String email;
	            while (true) {
	                System.out.println("Enter Email: ");
	                email = obj.nextLine().trim();
	                if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) break;
	                System.out.println("Invalid email format. Try again.");
	            }
	            
	            System.out.println("Enter Password (min 6 characters): ");
	            String passwordInput = obj.nextLine();
	            while (passwordInput.length() < 6) {
	                System.out.println("Password too short. Enter at least 6 characters: ");
	                passwordInput = obj.nextLine();
	            }
	            
	            int age;
	            while (true) {
	                System.out.println("Enter Age : ");
	                age = Integer.parseInt(obj.nextLine());
	                if (age > 0) break;
	                System.out.println("Invalid age. Must be positive.");
	            }
	            
	            String gender;
	            while (true) {
	                System.out.println("Enter Gender (Male/Female): ");
	                gender = obj.nextLine().trim();
	                if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other")) break;
	                System.out.println("Invalid gender. Choose Male, Female, or Other.");
	            }
	            
	            int height;
	            while (true) {
	                System.out.println("Enter Height (in cm): ");
	                height = Integer.parseInt(obj.nextLine());
	                if (height > 0) break;
	                System.out.println("Invalid height. Must be positive.");
	            }
	            
	            int weight;
	            while (true) {
	                System.out.println("Enter Weight (in kg): ");
	                weight = Integer.parseInt(obj.nextLine());
	                if (weight > 0) break;
	                System.out.println("Invalid weight. Must be positive.");
	            }
	            
	            System.out.println("Enter Active Level: ");
	            String activeLevel = obj.nextLine().trim();
	            
	            String dateOfBirth;
	            while (true) {
	                System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
	                dateOfBirth = obj.nextLine().trim();
	                if (dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}")) break;
	                System.out.println("Invalid date format. Use YYYY-MM-DD.");
	            }
	            
	            long contactNumber;
	            while (true) {
	                System.out.println("Enter Contact Number: ");
	                String contactInput = obj.nextLine().trim();
	                if (contactInput.matches("\\d{10}")) {
	                    contactNumber = Long.parseLong(contactInput);
	                    break;
	                }
	                System.out.println("Invalid contact number. Must be 10 digits.");
	            }
			pst.setInt(1,userId );
			pst.setString(2, fullName );
			pst.setString(3,email );
			pst.setString(4, passwordInput );
			pst.setInt(5,age );
			pst.setString(6,gender );
			pst.setInt(7, height);
			pst.setInt(8,weight);
			pst.setString(9,activeLevel);
			pst.setString(10,dateOfBirth  );
			pst.setLong(11,contactNumber );
			
			pst.executeUpdate();
			
			System.out.println("✨✨ Data Update Successfully✨✨ ✅");
			
			con.close();
			obj.close();
			
			}catch(SQLException e){
				e.printStackTrace();
			}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		try {
			insertdata();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	

}
