/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Autor;
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
public class AutorDAO {
    private static String dbURL = "jdbc:postgresql://localhost:8080//SOA";
    private static Connection conn = null;
    
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
    
    public ArrayList<Autor> consultarPublicacao(String nome) throws Exception{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Autor> listaAutor = new ArrayList<Autor>();
        Autor autor = null;
        try{
            abrirConexao();
            String sql = "select * from publicacao where titulo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            rs = stmt.executeQuery();
            while(rs.next()){
                autor = new Autor();
                autor.setId(rs.getInt("id"));
                autor.setNome(rs.getString("nome"));
                autor.setNome_de_citacao(rs.getString("nome_de_sitacao"));
                autor.setCpf(rs.getInt("cpf"));
                listaAutor.add(autor);
            }
        }finally{
            fecharConexao();
        }
        return listaAutor;
    }

}
