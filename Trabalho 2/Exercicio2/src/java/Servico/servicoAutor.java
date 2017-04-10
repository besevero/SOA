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
import Modelo.Autor;
import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
/**
 *
 * @author Bernardo
 */
@WebService(serviceName = "servicoConsulta")
public class servicoAutor {
    private AutorDAO dao = new AutorDAO();
    /**
     * This is a sample web service operation
     * @param nomeAutor
     * @return 
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "consultarAutor")
    public List<Autor> consultarAutor(@WebParam(name = "nomeAutor") String nomeAutor) throws Exception{
        List<Autor> listaAutores = dao.consultarAutor(nomeAutor);
         return listaAutores;
    }
    @WebMethod(operationName = "criarAutor")
    public void  criarAutor(@WebParam(name = "autor") Autor autor) {
        dao.inserirAutor(autor);
    }
    @WebMethod(operationName = "atualizarAutor")
    public void  atualizarAutor(@WebParam(name = "autor") Autor autor, @WebParam(name = "nomeAtualizar") String nome) {
        dao.atualizarAutor(autor, nome);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "excluirAutor")
    @Oneway
    public void excluirAutor(@WebParam(name = "autor") String nome) {
        dao.excluirAutor(nome);
        
    }

}
