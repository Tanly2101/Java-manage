
import java.sql.*;

class Connect {
    
    
    public static Connection getConnection(){
        Connection con = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "2101");
        } catch (Exception e) {
           e.printStackTrace();
       }
        
        return con;
        
    }

  
}



