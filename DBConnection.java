//In This Program with the help of JDBC we Connect the database 
import java.sql.*;
public class DBConnection
{
     private static final String url="jdbc:mysql://localhost:3306/studentdb";
     private static final String username="root";
     private static final String password="Swap@123";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url,username,password);
    }
}

