package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentCreate {
	
	
	public static void createStudent() {
	
		Scanner sc = new Scanner(System.in);
					
			System.out.println("enter roll number");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.println("enter  name");
			String name = sc.nextLine();
			System.out.println("enter  marks");
			float marks = sc.nextFloat();
			sc.nextLine();
			System.out.println("enter  dob yyyy-mm-dd");
			String dob = sc.nextLine();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
						"1234");

				PreparedStatement s = con.prepareStatement("insert into student1 values(?,?,?,?)");
				s.setInt(1, roll);
				s.setString(2, name);
				s.setFloat(3, marks);
				s.setString(4, dob);

				int i=s.executeUpdate();
				System.out.println("query executed sucessfully.....");

				 s.close();
				 con.close();

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
//		sc.close();
		
	}
}
