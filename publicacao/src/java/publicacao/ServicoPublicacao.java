/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicacao;

import DAO.publicacaoDAO;
import Modelo.PublicacaoModelo;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Bernardo
 */
@WebService(serviceName = "ServicoPublicacao")
public class ServicoPublicacao {
    private final publicacaoDAO dao = new publicacaoDAO();

  @WebMethod(operationName = "consultarPublicacao")
    public List<PublicacaoModelo> consultarPublicacao(@WebParam(name = "tituloPublicacao") String tituloPublicacao) throws Exception{
        List<PublicacaoModelo> listaPublicacoes = dao.consultarPublicacao(tituloPublicacao);
        return listaPublicacoes;
    }
    @WebMethod(operationName = "criarPublicacao")
    public String criarPublicacao(@WebParam(name = "publicacao") PublicacaoModelo publicacao) {
        dao.inserirPublicacao(publicacao);
        return "criado com sucesso";
    }
    @WebMethod(operationName = "atualizarPublicacao")
    public String  atualizarPublicacao(@WebParam(name = "pubicacao") PublicacaoModelo publicacao, @WebParam(name = "tituloAtualizar") String titulo) {
        dao.atualizarPublicacao(publicacao, titulo);
        return "Atualizado com sucesso";
    }

    /**
     * Operação de Web service
     * @param titulo
     */
    @WebMethod(operationName = "excluirPublicacao")
    
    public String excluirPublicacao(@WebParam(name = "titulo") String titulo) {
        dao.excluirPublicacao(titulo);
        return "Excluido com sucesso!";
    }
}
