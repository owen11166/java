package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iii", "root", "root");
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
