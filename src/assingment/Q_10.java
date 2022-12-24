package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Q_10 {

	public static void main(String[] args) {
		// 10. Make a program that displays number of columns present in the given table.
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root",
					"1234");

			PreparedStatement s = con.prepareStatement("select * from student1");

			ResultSet rs =s.executeQuery();

			ResultSetMetaData rsmd=	(ResultSetMetaData) rs.getMetaData();
			
			int col=rsmd.getColumnCount();
			System.out.println("number of colums: "+col);
			for(int i=1; i<=col; i++) {
				System.out.println(rsmd.getColumnName(i));
			}
			
			
			 s.close();
			 con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
