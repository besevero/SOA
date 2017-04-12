/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.Publicacao; 
import java.sql.Connection;  
import java.sql.Date;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bernardo
 */
public class publicacaoDAO {
   private static String dbURL = "jdbc:postgresql://localhost:5432/SOA";
    private static String usuario = "postgres";
    private static String senha = "1234";
    private static Connection conn = null;
    
    public publicacaoDAO(){}
    private static void abrirConexao(){
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, usuario, senha);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void fecharConexao(){
        try{
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Publicacao> consultarPublicacao(String titulo) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Publicacao> listaPublicacao = new ArrayList<>();
        Publicacao publicacao = null;
        
        try{
            abrirConexao();
  
            String sql = "SELECT * FROM publicacao WHERE titulo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,titulo);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                publicacao = new Publicacao();
                publicacao.setTitulo(rs.getString("titulo"));
                publicacao.setId(rs.getInt("id"));
                publicacao.setPaginaFinal(rs.getInt("paginafinal"));
                publicacao.setPaginaInicial(rs.getInt("paginainicial"));
                publicacao.setDataPublicacao(rs.getString("datapublicacao"));
                listaPublicacao.add(publicacao);
            }
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
        return listaPublicacao;
    }
    public void inserirPublicacao(Publicacao publicacao){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
  
            String sql = "INSERT INTO publicacao(titulo, paginainicial, paginafinal, datapublicacao)VALUES(?,?,?, ?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,publicacao.getTitulo());
            stmt.setInt(2,publicacao.getPaginaInicial());
            stmt.setInt(3,publicacao.getPaginaFinal());
            stmt.setString(5, publicacao.getDataPublicacao());
            rs = stmt.executeQuery();
            
            rs.close();
            stmt.close();
            
            fecharConexao();
            
        }catch(SQLException e){}
    }
    public void atualizarPublicacao(Publicacao publicacao, String alterartitulo){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
            String sql = "UPDATE publicacao SET titulo = ?, paginainicial = ?, paginafinal= ?, datapublicacao = ? WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,publicacao.getTitulo());
            stmt.setInt(2,publicacao.getPaginaInicial());
            stmt.setInt(3,publicacao.getPaginaFinal());
            stmt.setString(4, publicacao.getDataPublicacao());
            stmt.setString(5,alterartitulo);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
    }
    public void excluirPublicacao(String titulo){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
            String sql = "DELETE FROM publicacao WHERE titulo= ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,titulo);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
    }
}
