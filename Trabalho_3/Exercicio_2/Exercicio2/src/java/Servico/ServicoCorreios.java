/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException;
import br.com.correios.bsb.sigep.master.bean.cliente.Exception_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import javax.jws.WebService;

/**
 *
 * @author Bernardo
 */
@WebService(serviceName = "AtendeClienteService", portName = "AtendeClientePort", endpointInterface = "br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/AtendeCliente.xml.wsdl")
public class ServicoCorreios {

    public java.lang.Long fechaPlp(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String faixaEtiquetas, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.Retorno> registrarPedidosInformacao(java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoRegistro> pedidosInformacao, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP buscaCliente(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean validaEtiquetaPLP(java.lang.String numeroEtiqueta, java.lang.Long idPlp, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean verificaDisponibilidadeServico(java.lang.Integer codAdministrativo, java.lang.String numeroServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatusPLP(java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal> arg0, java.lang.String arg1) throws SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String bloquearObjeto(java.lang.String numeroEtiqueta, java.lang.Long idPlp, br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio, br.com.correios.bsb.sigep.master.bean.cliente.Acao acao, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitaEtiquetas(java.lang.String tipoDestinatario, java.lang.String identificador, java.lang.Long idServico, java.lang.Integer qtdEtiquetas, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster> obterMensagemRetornoPI() throws SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.Retorno> consultarPedidosInformacao(java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoConsulta> pedidosInformacao, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String buscaPagamentoEntrega(java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.Integer> geraDigitoVerificadorEtiquetas(java.util.List<java.lang.String> etiquetas, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean cancelarObjeto(java.lang.Long idPlp, java.lang.String numeroEtiqueta, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, Exception_Exception, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Long fechaPlpVariosServicos(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.util.List<java.lang.String> listaEtiquetas, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean validarPostagemReversa(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversaTO coleta, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean validaPlp(long cliente, java.lang.String numero, long diretoria, java.lang.String cartao, java.lang.String unidadePostagem, java.lang.Long servico, java.util.List<java.lang.String> servicosAdicionais, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO cancelarPedidoScol(java.lang.Integer codAdministrativo, java.lang.String idPostagem, java.lang.String tipo, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster> obterEmbalagemLRS() throws SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean validarPostagemSimultanea(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultaneaTO coleta, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP> buscaServicos(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitarPostagemScol(java.lang.Integer codAdministrativo, java.lang.String xml, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao getStatusCartaoPostagem(java.lang.String numeroCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String solicitaXmlPlp(java.lang.Long idPlpMaster, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster> obterMotivosPI() throws SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP buscaContrato(java.lang.String numero, long diretoria, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String consultaSRO(java.util.List<java.lang.String> listaObjetos, java.lang.String tipoConsulta, java.lang.String tipoResultado, java.lang.String usuarioSro, java.lang.String senhaSro) throws SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public javax.xml.datatype.XMLGregorianCalendar obterClienteAtualizacao(java.lang.String cnpjCliente, java.lang.String usuario, java.lang.String senha) throws SigepClienteException, AutenticacaoException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.Boolean integrarUsuarioScol(java.lang.Integer codAdministrativo, java.lang.String usuario, java.lang.String senha) throws AutenticacaoException, SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster> obterAssuntosPI() throws SigepClienteException {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP consultaCEP(java.lang.String cep) throws SigepClienteException, SQLException_Exception {
        //TODO implement this method
        
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
