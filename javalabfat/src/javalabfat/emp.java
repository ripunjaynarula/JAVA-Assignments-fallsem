package javalabfat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class emp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		Statement s1=con.createStatement();
		String sql="select * from employee_java where Designation='Manager' AND (SELECT MIN(Dateofjoining) FROM employee_java)";
		ResultSet res=s1.executeQuery(sql);
        while(res.next()) {
        
        	System.out.println(res.getString(2));
        
        }
	}

}