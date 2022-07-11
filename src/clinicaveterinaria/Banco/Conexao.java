/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author L01E01
 */
public class Conexao {
    private static final String DRIVER = "jdbc:mysql://";
    private static final String HOST = "localhost";
    private static final String BANCO = "mydb";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static String status;
    
    public static Connection obterConexao(){
       try{
          Class.forName("com.mysql.jdbc.Driver");
          return DriverManager.getConnection(DRIVER+HOST+"/"+BANCO,USUARIO,SENHA);
          
       } 
       catch(ClassNotFoundException | SQLException erro){
           status = "ERRO: "+erro.getMessage();
           return null;
       }
    }
    
    
   public static void fecharConexao(Connection conn){
       try{
           if(conn != null){
               conn.close();
           }
        }
       catch(SQLException erro){
           status = "ERRO: "+erro.getMessage();
       }
   }
   
   
    public static void fecharConexao(Connection conn, Statement stm) {
        try {
            
            if(stm !=null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        catch (SQLException erro) {
            status = "Erro: " + erro.getMessage();
        }
   }
    
    
    public static void fecharConexao(Connection conn, Statement stm, ResultSet rs){
        try {
            if(rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }
            if(conn != null){
                conn.close();
            }
        } catch (SQLException erro) {
            status = "Erro: " + erro.getMessage();
        }
        }
}
