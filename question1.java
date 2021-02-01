import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
class question1 {
    private static String user ="root";
    private static String password = "root";
    private static Connection con=null;
    private static Statement st=null;
    private static ResultSet rs=null;
    public static void main(String args[])throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/flaskapp", user, password);
            System.out.println("Success");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        try{
           st=con.createStatement();
           rs=st.executeQuery("select * from user");
           while(rs.next()) System.out.println(rs.getString("email"));
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            }
            catch (SQLException e){
                System.out.println(e);
            }
        }
    }
}