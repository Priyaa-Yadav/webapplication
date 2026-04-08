package mypack;
import java.sql.*;
public class DatabaseManager 
{
   Connection con=null;
   PreparedStatement pd=null;
   ResultSet rs=null;
   public DatabaseManager()throws Exception
   {
       Class.forName("com.mysql.jdbc.Driver");
   }
       public Connection getCon()throws Exception
       {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project24","root","");
           return con;
       }
       //code for insert update delete data
       public boolean Insert_Update_Delete(String command)throws Exception
       {
           pd=getCon().prepareStatement(command);
           pd.executeUpdate(command);
           return true;
       }
       //end code for insert update delete data
       //code for display result
       public ResultSet DisplayRecords(String command)throws Exception
       {
         pd=getCon().prepareStatement(command);
         rs=pd.executeQuery(command);
         return rs;
       }
       //end code for display data
}
