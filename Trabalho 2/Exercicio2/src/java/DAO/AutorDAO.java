/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Autor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bernardo
 */
public class AutorDAO {
    private String dbURL = "jdbc:postgresql://localhost:5432/SOA";
    private String usuario = "postgres";
    private String senha = "1234";
    
    public AutorDAO(){}
    
    public List<Autor> consultarPublicacao(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        Statement stmt = null;
        ResultSet rs = null;
        List<Autor> listaAutor = new ArrayList<>();
        Autor autor = null;
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, usuario, senha);
  
            String sql = "SELECT * FROM autores;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                autor = new Autor();
                autor.setId(rs.getInt("id"));
                autor.setNome(rs.getString("nome"));
                autor.setNome_de_citacao(rs.getString("nome_de_citacao"));
                autor.setCpf(rs.getInt("cpf"));
                listaAutor.add(autor);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException e){}
        return listaAutor;
    }

}
