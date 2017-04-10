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
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Publicacao> consultarAutor(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Publicacao> listaPublicacao = new ArrayList<>();
        Publicacao autor = null;
        
        try{
            abrirConexao();
  
            String sql = "SELECT * FROM autores WHERE nome = ?;";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                publicacao = new Autor();
                autor.setId(rs.getInt("id"));
                autor.setNome(rs.getString("nome"));
                autor.setNome_de_citacao(rs.getString("nome_de_citacao"));
                autor.setCpf(rs.getInt("cpf"));
                listaPublicacao.add(autor);
            }
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
        return listaPublicacao;
    }
    public void inserirAutor(Autor autor){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
  
            String sql = "INSERT INTO autores(nome, nome_de_citacao, cpf)VALUES(?,?,?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,autor.getNome());
            stmt.setString(2,autor.getNome_de_citacao());
            stmt.setInt(3,autor.getCpf());
            rs = stmt.executeQuery();
            
            rs.close();
            stmt.close();
            
            fecharConexao();
            
        }catch(SQLException e){}
    }
    public void atualizarAutor(Autor autor, String nomeAlterar){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
            String sql = "UPDATE autores SET nome = ?, nome_de_citacao = ?, cpf = ? WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,autor.getNome());
            stmt.setString(2,autor.getNome_de_citacao());
            stmt.setInt(3,autor.getCpf());
            stmt.setString(4,nomeAlterar);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
    }
    public void excluirAutor(String nome){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
            String sql = "DELETE FROM autores WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
    }
}
