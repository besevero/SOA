
package exercicio2cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exercicio2cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AtualizarPublicacaoResponse_QNAME = new QName("http://Servico/", "atualizarPublicacaoResponse");
    private final static QName _AtualizarPublicacao_QNAME = new QName("http://Servico/", "atualizarPublicacao");
    private final static QName _ConsultarPublicacao_QNAME = new QName("http://Servico/", "consultarPublicacao");
    private final static QName _CriarPublicacaoResponse_QNAME = new QName("http://Servico/", "criarPublicacaoResponse");
    private final static QName _ConsultarPublicacaoResponse_QNAME = new QName("http://Servico/", "consultarPublicacaoResponse");
    private final static QName _Exception_QNAME = new QName("http://Servico/", "Exception");
    private final static QName _CriarPublicacao_QNAME = new QName("http://Servico/", "criarPublicacao");
    private final static QName _ExcluirPublicacao_QNAME = new QName("http://Servico/", "excluirPublicacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exercicio2cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPublicacaoResponse }
     * 
     */
    public ConsultarPublicacaoResponse createConsultarPublicacaoResponse() {
        return new ConsultarPublicacaoResponse();
    }

    /**
     * Create an instance of {@link AtualizarPublicacao }
     * 
     */
    public AtualizarPublicacao createAtualizarPublicacao() {
        return new AtualizarPublicacao();
    }

    /**
     * Create an instance of {@link ConsultarPublicacao }
     * 
     */
    public ConsultarPublicacao createConsultarPublicacao() {
        return new ConsultarPublicacao();
    }

    /**
     * Create an instance of {@link CriarPublicacaoResponse }
     * 
     */
    public CriarPublicacaoResponse createCriarPublicacaoResponse() {
        return new CriarPublicacaoResponse();
    }

    /**
     * Create an instance of {@link AtualizarPublicacaoResponse }
     * 
     */
    public AtualizarPublicacaoResponse createAtualizarPublicacaoResponse() {
        return new AtualizarPublicacaoResponse();
    }

    /**
     * Create an instance of {@link CriarPublicacao }
     * 
     */
    public CriarPublicacao createCriarPublicacao() {
        return new CriarPublicacao();
    }

    /**
     * Create an instance of {@link ExcluirPublicacao }
     * 
     */
    public ExcluirPublicacao createExcluirPublicacao() {
        return new ExcluirPublicacao();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Publicacao }
     * 
     */
    public Publicacao createPublicacao() {
        return new Publicacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "atualizarPublicacaoResponse")
    public JAXBElement<AtualizarPublicacaoResponse> createAtualizarPublicacaoResponse(AtualizarPublicacaoResponse value) {
        return new JAXBElement<AtualizarPublicacaoResponse>(_AtualizarPublicacaoResponse_QNAME, AtualizarPublicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "atualizarPublicacao")
    public JAXBElement<AtualizarPublicacao> createAtualizarPublicacao(AtualizarPublicacao value) {
        return new JAXBElement<AtualizarPublicacao>(_AtualizarPublicacao_QNAME, AtualizarPublicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "consultarPublicacao")
    public JAXBElement<ConsultarPublicacao> createConsultarPublicacao(ConsultarPublicacao value) {
        return new JAXBElement<ConsultarPublicacao>(_ConsultarPublicacao_QNAME, ConsultarPublicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "criarPublicacaoResponse")
    public JAXBElement<CriarPublicacaoResponse> createCriarPublicacaoResponse(CriarPublicacaoResponse value) {
        return new JAXBElement<CriarPublicacaoResponse>(_CriarPublicacaoResponse_QNAME, CriarPublicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "consultarPublicacaoResponse")
    public JAXBElement<ConsultarPublicacaoResponse> createConsultarPublicacaoResponse(ConsultarPublicacaoResponse value) {
        return new JAXBElement<ConsultarPublicacaoResponse>(_ConsultarPublicacaoResponse_QNAME, ConsultarPublicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "criarPublicacao")
    public JAXBElement<CriarPublicacao> createCriarPublicacao(CriarPublicacao value) {
        return new JAXBElement<CriarPublicacao>(_CriarPublicacao_QNAME, CriarPublicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "excluirPublicacao")
    public JAXBElement<ExcluirPublicacao> createExcluirPublicacao(ExcluirPublicacao value) {
        return new JAXBElement<ExcluirPublicacao>(_ExcluirPublicacao_QNAME, ExcluirPublicacao.class, null, value);
    }

}
