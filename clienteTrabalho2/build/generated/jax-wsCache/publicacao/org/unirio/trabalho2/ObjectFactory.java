
package org.unirio.trabalho2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.unirio.trabalho2 package. 
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

    private final static QName _OperacaoTeste_QNAME = new QName("http://trabalho2.unirio.org/", "operacaoTeste");
    private final static QName _OperacaoTesteResponse_QNAME = new QName("http://trabalho2.unirio.org/", "operacaoTesteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.unirio.trabalho2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperacaoTeste }
     * 
     */
    public OperacaoTeste createOperacaoTeste() {
        return new OperacaoTeste();
    }

    /**
     * Create an instance of {@link OperacaoTesteResponse }
     * 
     */
    public OperacaoTesteResponse createOperacaoTesteResponse() {
        return new OperacaoTesteResponse();
    }

    /**
     * Create an instance of {@link Publicacoes }
     * 
     */
    public Publicacoes createPublicacoes() {
        return new Publicacoes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoTeste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trabalho2.unirio.org/", name = "operacaoTeste")
    public JAXBElement<OperacaoTeste> createOperacaoTeste(OperacaoTeste value) {
        return new JAXBElement<OperacaoTeste>(_OperacaoTeste_QNAME, OperacaoTeste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoTesteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trabalho2.unirio.org/", name = "operacaoTesteResponse")
    public JAXBElement<OperacaoTesteResponse> createOperacaoTesteResponse(OperacaoTesteResponse value) {
        return new JAXBElement<OperacaoTesteResponse>(_OperacaoTesteResponse_QNAME, OperacaoTesteResponse.class, null, value);
    }

}
