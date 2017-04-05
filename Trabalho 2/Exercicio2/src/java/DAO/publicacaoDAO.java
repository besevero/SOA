/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.Publicacao; 
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class publicacaoDAO {
    private static String dbURL = "jdbc:postgresql://localhost:8080//SOA";
    private static Connection conn = null;
    
    public publicacaoDAO(){}
    
    private static void abrirConexao(){
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, "postgres", "1234");
        }catch(Exception except){
            except.printStackTrace();
        }
        
    }
    private static void fecharConexao(){
        try{
            conn.close();
        }catch(Exception except){
            except.printStackTrace();
        }
        
    }
    
    public ArrayList<Publicacao> consultarPublicacao(String titulo) throws Exception{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Publicacao> listaPublicacao = new ArrayList<Publicacao>();
        Publicacao publicacao = null;
        try{
            abrirConexao();
            String sql = "select * from publicacao where titulo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            rs = stmt.executeQuery();
            while(rs.next()){
                publicacao = new Publicacao();
                publicacao.setId(rs.getInt("id"));
                publicacao.setPaginaInicial(rs.getInt("paginaInicial"));
                publicacao.setPaginaFinal(rs.getInt("paginaFinal"));
                publicacao.setTitulo(rs.getString("titulo"));
                listaPublicacao.add(publicacao);
            }
        }finally{
            fecharConexao();
        }
        return listaPublicacao;
    }

}
