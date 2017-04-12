
package exercicio2cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de criarPublicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarPublicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicacao" type="{http://Servico/}publicacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarPublicacao", propOrder = {
    "publicacao"
})
public class CriarPublicacao {

    protected Publicacao publicacao;

    /**
     * Obtém o valor da propriedade publicacao.
     * 
     * @return
     *     possible object is
     *     {@link Publicacao }
     *     
     */
    public Publicacao getPublicacao() {
        return publicacao;
    }

    /**
     * Define o valor da propriedade publicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Publicacao }
     *     
     */
    public void setPublicacao(Publicacao value) {
        this.publicacao = value;
    }

}
