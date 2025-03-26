
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khan
 */
public class DatabaseConnection {
    public static Connection getConnection() throws SQLException{
     Connection connection=null;   
    
    try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/HomePage","root","Root");
          System.out.println("Connected to MySQL database!");
    }
    catch(ClassNotFoundException | SQLException e){
      System.out.println("Connection error:" + e.getMessage());
    }
     return connection;
    }
    public static void main(String[] args) throws SQLException{
        getConnection();
    }
}
    
