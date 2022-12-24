package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Q_02 {
	public static void main(String[] args) {
		
//		02. Create a program to insert record in the student table.
		int x=0;
		Scanner sc = new Scanner(System.in);
		do {
			
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
			System.out.println("enter 0 to exit 1 to add more entry");
			x=sc.nextInt();
		}while(x!=0);
		sc.close();
		System.out.println("prog close.......");
	}
}
