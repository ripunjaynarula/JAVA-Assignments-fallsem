package labfat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class emp {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sweet","root","");

	}

}