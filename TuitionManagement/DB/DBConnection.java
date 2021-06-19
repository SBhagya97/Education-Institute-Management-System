/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuitionManagement.DB;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {

   private Connection conn;
   private static DBConnection dbConnection;
   
   private DBConnection()throws ClassNotFoundException,SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       Properties dbproperties=new Properties();
       File dbFile=new File("settings/DBProperties.properties");
       FileReader fileReader;
       
       try {
           fileReader=new FileReader(dbFile);
           try {
               dbproperties.load(fileReader);
           } catch (IOException ex) {
               Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
       String userName=dbproperties.getProperty("userName");
       String password=dbproperties.getProperty("password");
       String ip=dbproperties.getProperty("ip");
       String database=dbproperties.getProperty("database");
       conn= (Connection) DriverManager.getConnection("jdbc:mysql://"+ip+"/"+database+"",""+userName+"", ""+password+"");
   }
   public Connection getConnection(){
       return conn;
   }
    public static DBConnection getDBConnection()throws ClassNotFoundException,SQLException{
        if(dbConnection==null){
            dbConnection=new DBConnection();
        }
       return dbConnection; 
    }
}
