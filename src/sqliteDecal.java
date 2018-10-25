import java.sql.*;
import javax.swing.*;

public class sqliteDecal {
	Connection con = null;
	public static Connection dconnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:database\\decalorder.sqlite");
			JOptionPane.showMessageDialog(null, "Database Connection Successfully");
			return con;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
