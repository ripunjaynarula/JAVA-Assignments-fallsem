import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class faculty {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sweet","root","");
        Statement s1=con.createStatement();
        Statement s2=con.createStatement();
        Statement s3=con.createStatement();
        String sql="select * from dmen";
        ResultSet res=s1.executeQuery(sql);
        while(res.next()) {
        
        	System.out.println(res.getString(2));
        
        }
        
        }
       

}
