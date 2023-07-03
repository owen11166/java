package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iii", "root", "root");
			Statement stmt = conn.createStatement();
			int n= stmt.executeUpdate("INSERT INTO cust(cname,tel,birthday)VALUES('PETER','321','1999-10-01')");
			System.out.println(n);
		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
