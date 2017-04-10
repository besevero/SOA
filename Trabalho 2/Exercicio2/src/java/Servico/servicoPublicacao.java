/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import DAO.publicacaoDAO;
import Modelo.Publicacao;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Bernardo
 */
@WebService(serviceName = "servicoPublicacao")
public class servicoPublicacao {
    private publicacaoDAO dao = new publicacaoDAO();
    /**
     * This is a sample web service operation
     * @param tituloPublicacao
     * @return 
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "consultarPublicacao")
    public List<Publicacao> consultarPublicacao(@WebParam(name = "tituloPublicacao") String tituloPublicacao) throws Exception{
        List<Publicacao> listaPublicacoes = dao.consultarPublicacao(tituloPublicacao);
        return listaPublicacoes;
    }
    @WebMethod(operationName = "criarPublicacao")
    public void criarPublicacao(@WebParam(name = "publicacao") Publicacao publicacao) {
        dao.inserirPublicacao(publicacao);
    }
    @WebMethod(operationName = "atualizarPublicacao")
    public void  atualizarPublicacao(@WebParam(name = "pubicacao") Publicacao publicacao, @WebParam(name = "tituloAtualizar") String titulo) {
        dao.atualizarPublicacao(publicacao, titulo);
    }

    /**
     * Operação de Web service
     * @param titulo
     */
    @WebMethod(operationName = "excluirPublicacao")
    @Oneway
    public void excluirPublicacao(@WebParam(name = "titulo") String titulo) {
        dao.excluirPublicacao(titulo);
        
    }
   
}
