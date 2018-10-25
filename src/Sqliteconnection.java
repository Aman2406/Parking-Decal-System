import java.sql.*;
import javax.swing.*;

public class Sqliteconnection {
   
	Connection conn = null;
	public static Connection dbconnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:database\\logincred.sqlite");
			//JOptionPane.showMessageDialog(null, "Database Connection Successfull");
			return conn;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}


