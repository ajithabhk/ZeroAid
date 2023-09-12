/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.sql.*;
/**
 *
 * @author ajithabh krishna
 */
public class db {
    public static Connection mycon(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app","root","root");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    
    }
}
