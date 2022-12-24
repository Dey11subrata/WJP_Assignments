package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q_08 {

	public static void main(String[] args) {
		// 08. Create a program to display average marks obtained by the student.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
					"1234");

			PreparedStatement s = con.prepareStatement("select AVG (marks) from student1 ");

			ResultSet rs=s.executeQuery();
			while(rs.next()){
				System.out.println("average marks: "+ rs.getFloat(1));
			}

			 s.close();
			 con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
