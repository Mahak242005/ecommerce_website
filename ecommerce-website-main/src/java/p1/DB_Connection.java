
package p1;

import java.sql.*;

public class DB_Connection 
{
    public static String SENDERS_EMAILID="mahakkashyap432@gmail.com";
    public static String SENDERS_PASSWORD="12345678";
    
    public static Connection get_DBConnection()
    {
        Connection conn=null;
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/interior_db","root","1234");
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return conn;
    }
    
}
