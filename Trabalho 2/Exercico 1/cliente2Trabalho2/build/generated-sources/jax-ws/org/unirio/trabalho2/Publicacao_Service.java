
package org.unirio.trabalho2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "publicacao", targetNamespace = "http://trabalho2.unirio.org/", wsdlLocation = "http://localhost:8080/trabalho2/publicacao?wsdl")
public class Publicacao_Service
    extends Service
{

    private final static URL PUBLICACAO_WSDL_LOCATION;
    private final static WebServiceException PUBLICACAO_EXCEPTION;
    private final static QName PUBLICACAO_QNAME = new QName("http://trabalho2.unirio.org/", "publicacao");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/trabalho2/publicacao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUBLICACAO_WSDL_LOCATION = url;
        PUBLICACAO_EXCEPTION = e;
    }

    public Publicacao_Service() {
        super(__getWsdlLocation(), PUBLICACAO_QNAME);
    }

    public Publicacao_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PUBLICACAO_QNAME, features);
    }

    public Publicacao_Service(URL wsdlLocation) {
        super(wsdlLocation, PUBLICACAO_QNAME);
    }

    public Publicacao_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PUBLICACAO_QNAME, features);
    }

    public Publicacao_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Publicacao_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Publicacao
     */
    @WebEndpoint(name = "publicacaoPort")
    public Publicacao getPublicacaoPort() {
        return super.getPort(new QName("http://trabalho2.unirio.org/", "publicacaoPort"), Publicacao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Publicacao
     */
    @WebEndpoint(name = "publicacaoPort")
    public Publicacao getPublicacaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://trabalho2.unirio.org/", "publicacaoPort"), Publicacao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUBLICACAO_EXCEPTION!= null) {
            throw PUBLICACAO_EXCEPTION;
        }
        return PUBLICACAO_WSDL_LOCATION;
    }

}
