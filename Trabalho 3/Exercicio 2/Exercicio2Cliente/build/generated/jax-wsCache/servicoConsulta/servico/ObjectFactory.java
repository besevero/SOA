
package servico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servico package. 
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

    private final static QName _CriarAutor_QNAME = new QName("http://Servico/", "criarAutor");
    private final static QName _Exception_QNAME = new QName("http://Servico/", "Exception");
    private final static QName _ConsultarAutor_QNAME = new QName("http://Servico/", "consultarAutor");
    private final static QName _ConsultarAutorResponse_QNAME = new QName("http://Servico/", "consultarAutorResponse");
    private final static QName _ExcluirAutor_QNAME = new QName("http://Servico/", "excluirAutor");
    private final static QName _CriarAutorResponse_QNAME = new QName("http://Servico/", "criarAutorResponse");
    private final static QName _AtualizarAutor_QNAME = new QName("http://Servico/", "atualizarAutor");
    private final static QName _AtualizarAutorResponse_QNAME = new QName("http://Servico/", "atualizarAutorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CriarAutor }
     * 
     */
    public CriarAutor createCriarAutor() {
        return new CriarAutor();
    }

    /**
     * Create an instance of {@link AtualizarAutor }
     * 
     */
    public AtualizarAutor createAtualizarAutor() {
        return new AtualizarAutor();
    }

    /**
     * Create an instance of {@link AtualizarAutorResponse }
     * 
     */
    public AtualizarAutorResponse createAtualizarAutorResponse() {
        return new AtualizarAutorResponse();
    }

    /**
     * Create an instance of {@link CriarAutorResponse }
     * 
     */
    public CriarAutorResponse createCriarAutorResponse() {
        return new CriarAutorResponse();
    }

    /**
     * Create an instance of {@link ConsultarAutor }
     * 
     */
    public ConsultarAutor createConsultarAutor() {
        return new ConsultarAutor();
    }

    /**
     * Create an instance of {@link ConsultarAutorResponse }
     * 
     */
    public ConsultarAutorResponse createConsultarAutorResponse() {
        return new ConsultarAutorResponse();
    }

    /**
     * Create an instance of {@link ExcluirAutor }
     * 
     */
    public ExcluirAutor createExcluirAutor() {
        return new ExcluirAutor();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "criarAutor")
    public JAXBElement<CriarAutor> createCriarAutor(CriarAutor value) {
        return new JAXBElement<CriarAutor>(_CriarAutor_QNAME, CriarAutor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "consultarAutor")
    public JAXBElement<ConsultarAutor> createConsultarAutor(ConsultarAutor value) {
        return new JAXBElement<ConsultarAutor>(_ConsultarAutor_QNAME, ConsultarAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "consultarAutorResponse")
    public JAXBElement<ConsultarAutorResponse> createConsultarAutorResponse(ConsultarAutorResponse value) {
        return new JAXBElement<ConsultarAutorResponse>(_ConsultarAutorResponse_QNAME, ConsultarAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "excluirAutor")
    public JAXBElement<ExcluirAutor> createExcluirAutor(ExcluirAutor value) {
        return new JAXBElement<ExcluirAutor>(_ExcluirAutor_QNAME, ExcluirAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "criarAutorResponse")
    public JAXBElement<CriarAutorResponse> createCriarAutorResponse(CriarAutorResponse value) {
        return new JAXBElement<CriarAutorResponse>(_CriarAutorResponse_QNAME, CriarAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "atualizarAutor")
    public JAXBElement<AtualizarAutor> createAtualizarAutor(AtualizarAutor value) {
        return new JAXBElement<AtualizarAutor>(_AtualizarAutor_QNAME, AtualizarAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servico/", name = "atualizarAutorResponse")
    public JAXBElement<AtualizarAutorResponse> createAtualizarAutorResponse(AtualizarAutorResponse value) {
        return new JAXBElement<AtualizarAutorResponse>(_AtualizarAutorResponse_QNAME, AtualizarAutorResponse.class, null, value);
    }

}
