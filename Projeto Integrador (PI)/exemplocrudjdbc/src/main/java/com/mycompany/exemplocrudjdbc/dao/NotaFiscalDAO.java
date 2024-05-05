/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocrudjdbc.dao;

import com.mycompany.exemplocrudjdbc.models.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.tfernandes
 */
public class NotaFiscalDAO {
    
    static String url = "jdbc:mysql://localhost:3306/basenotafiscal";
    static String login = "root";
    static String password = "Root123@";
    
    public static boolean salvar(NotaFiscal obj){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //Passo 1 Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, login, password);
            
            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO notafiscal (numeroNota,valorNota) VALUES(?,?)");
            comandoSQL.setInt(1, obj.getNumeroNota());
            comandoSQL.setDouble(2, obj.getValorNota());
            
            //Passo 4 - Executar o comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
               retorno = true;     
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }
    
    public static ArrayList<NotaFiscal> listar(){
        ArrayList<NotaFiscal> lstNotas = new ArrayList<NotaFiscal>();
        
        Connection conexao = null;
        
        try {
            //Passo 1 Carregar o Driver
            Class.forName("org.sqlite.JDBC");
            
            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, login, password);
            
            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM notafiscal");
            
            
            //Passo 4 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            
            while(rs.next()){
                //Para cada linha, crio um objeto Nota e adiciona à lista de retorno
                int idNota = rs.getInt("idNota");
                int numeroNota = rs.getInt("numeroNota");
                double valorNota = rs.getDouble("valorNota");
                
                NotaFiscal item = new NotaFiscal(idNota, numeroNota, valorNota);
                
                //Adiciono o item à lista de retorno
                lstNotas.add(item);
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstNotas;
    }
    
    public static boolean alterar(NotaFiscal obj){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //Passo 1 Carregar o Driver
            Class.forName("org.sqlite.JDBC");
            
            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, login, password);
            
            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE NotaFiscal SET numeroNota = ?, valorNota = ? WHERE idNota = ? ");
            comandoSQL.setInt(1, obj.getNumeroNota());
            comandoSQL.setDouble(2, obj.getValorNota());
            comandoSQL.setInt(3, obj.getIdNota());
            
            //Passo 4 - Executar o comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
               retorno = true;     
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }
    
    public static boolean excluir(int idExcluir){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //Passo 1 Carregar o Driver
            Class.forName("org.sqlite.JDBC");
            
            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, login, password);
            
            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM NotaFiscal WHERE idNota = ?");
            comandoSQL.setInt(1, idExcluir);
            
            //Passo 4 - Executar o comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
               retorno = true;     
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }
    
    public static NotaFiscal buscarPorNumero(int numero){
        NotaFiscal retorno = null;
        
        Connection conexao = null;
        
        try {
            //Passo 1 Carregar o Driver
            Class.forName("org.sqlite.JDBC");
            
            //Passo 2 - Abrir a conexao
            conexao = DriverManager.getConnection(url, login, password);
            
            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM notafiscal WHERE numeroNota = ?");
            comandoSQL.setInt(1, numero);
            
            
            //Passo 4 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            
            while(rs.next()){
                //Para cada linha, crio um objeto Nota e adiciona à lista de retorno
                int idNota = rs.getInt("idNota");
                int numeroNota = rs.getInt("numeroNota");
                double valorNota = rs.getDouble("valorNota");
                
                retorno = new NotaFiscal(idNota, numeroNota, valorNota);
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }
}
