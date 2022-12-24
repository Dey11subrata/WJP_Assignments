package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q_05 {

	public static void main(String[] args) {
		//05. Create a program to display no. of student records present in the table.
try {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "1234");

	PreparedStatement s = con.prepareStatement("select count(*) from student1");

	 ResultSet rs =s.executeQuery();
	 while (rs.next()) {
		 System.out.println("Students Record Present: "+rs.getInt(1));
	 }

	 s.close();
	 con.close();

} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
