package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q_01 {

	public static void main(String[] args) {
		// 01. Create a program to create table named student having columns [ rno, name, marks, date of birth].
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "1234");
			
				PreparedStatement s = con.prepareStatement("create table student1 (rno int, name varchar(20), marks float, dob date)");
				
				boolean r=s.execute();
			System.out.println("table created....");
				 s.close();
				 con.close();
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
