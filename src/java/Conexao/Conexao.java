/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Amanda
 */
public final class Conexao {
/* "jdbc:postgresql://127.0.0.1:5432/OliveiraTradeBD";*/
    
   public static Connection getConexao()throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OliveiraTradeDB", "postgres", "postgres");
        return conn;
    }
}
