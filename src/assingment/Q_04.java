package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q_04 {

	public static void main(String[] args) {
		//04. Create a program to display the student records in sorted order of marks [ highest to lowest ].
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "1234");
			
				PreparedStatement s = con.prepareStatement("select * from student1 order by marks desc");
			
				ResultSet rs = s.executeQuery();
			while(rs.next()) {
				System.out.println("| "+ rs.getInt(1)+","+ rs.getString(2)+","+rs.getFloat(3)+","+rs.getString(4)+" |");
			}
				 s.close();
				 con.close();
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
