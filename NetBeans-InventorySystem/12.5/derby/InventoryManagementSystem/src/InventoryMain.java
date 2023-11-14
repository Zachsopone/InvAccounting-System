

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author GIGABYTE
 */
public class InventoryMain {
    
    private static String servername="localhost";
    private static String dbname="inventoryms";
    private static String username="root";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection GetConnection(){
    Connection cn=null;
    MysqlDataSource datasource = new  MysqlDataSource();
    datasource.setServerName(servername);
    datasource.setUser(username);
    datasource.setDatabaseName(dbname);
    datasource.setPassword(password);
    try{
    cn=datasource.getConnection();
    }catch (SQLException ex){
    Logger.getLogger(InventoryMain.class.getName()).log(Level.SEVERE, null, ex);
    }
    return cn;
    }

}