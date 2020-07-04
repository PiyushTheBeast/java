package assgm;
import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
	
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user\\eclipse-workspace14\\assgm\\userdata.db");
			JOptionPane.showMessageDialog(null, "Connection Successful");
			return conn;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
