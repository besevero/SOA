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
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class AutorDAO {
    private static String dbURL = "jdbc:postgresql://localhost:8080//SOA";
    private static Connection conn = null;
    
    public AutorDAO(){}
    
    public ArrayList<Autor> consultarPublicacao(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Autor> listaAutor = new ArrayList<>();
        Autor autor = null;
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, "bernardo", "1234");
            
            String sql = "SELECT * FROM autor WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
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
            conn.close();
        }
        return listaAutor;
    }

}
