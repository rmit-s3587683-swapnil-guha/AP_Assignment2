import java.sql.*;

import javax.swing.JOptionPane;



public class Sqliteconnection {
	Connection conn = null;

	public static Connection dbconnector() {

		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Zaid\\workspace\\Aussie Sports System\\Assignment 2\\data.sqlite");
			JOptionPane.showMessageDialog(null, "Opened database successfully");
			//System.out.println("Opened database successfully");
			return conn;
		} catch ( Exception e ) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}

}
