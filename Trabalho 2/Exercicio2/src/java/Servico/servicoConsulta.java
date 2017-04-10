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
    public List<Autor> consultarAutor(@WebParam(name = "nomeAutor") String nomeAutor) throws Exception{
        AutorDAO dao = new AutorDAO();
        List<Autor> listaAutores = dao.consultarPublicacao(nomeAutor);
 
        return listaAutores;
    }
}
