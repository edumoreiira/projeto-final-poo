/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connections;

import DAO.PratoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduu_
 */
public class DBConnection {
    private static final String URL = "jdbc:sqlite:pratos.db";
    public static Connection getConnection() {
        
       try {
           return DriverManager.getConnection(URL);
       } catch (SQLException ex) {
           System.out.println("Banco não conectado!");
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
    
    public static void closeConnection(java.sql.Connection con){
       try {
           con.close();
       } catch (SQLException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void closeConnection(java.sql.Connection con, PreparedStatement stmt){
       closeConnection(con);
        try {  
           
           stmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void closeConnection(java.sql.Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
       try {
           rs.close();
       } catch (SQLException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    
    
    public static void main(String[] args) {
        PratoDAO prato = new PratoDAO();
        prato.lerBanco();
    }
}
