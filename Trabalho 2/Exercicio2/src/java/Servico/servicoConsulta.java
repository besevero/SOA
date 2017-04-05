/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import DAO.AutorDAO;
import DAO.publicacaoDAO;
import Modelo.Autor;
import Modelo.Publicacao;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Bernardo
 */
@WebService(serviceName = "servicoConsulta")
public class servicoConsulta {

    /**
     * This is a sample web service operation
     * @param nomeAutor
     * @return 
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "consultarAutor")
    public ArrayList<Autor> consultarAutor(@WebParam(name = "nome") String nomeAutor) throws Exception{
        AutorDAO dao = new AutorDAO();
        ArrayList<Autor> listaAutores = dao.consultarPublicacao(nomeAutor);
        ArrayList<Autor> resposta = new ArrayList<>();
        for (int i = 0; i< listaAutores.size() ; i++)
            if(listaAutores.get(i).getNome().equals(nomeAutor)){
                resposta.add(listaAutores.get(i));
                System.out.println(resposta.get(i).getNome());
                System.out.println(resposta.get(i).getCpf());
                System.out.println(resposta.get(i).getId());
                System.out.println(resposta.get(i).getNome_de_citacao());
            }
       
        return resposta;
    }
}
