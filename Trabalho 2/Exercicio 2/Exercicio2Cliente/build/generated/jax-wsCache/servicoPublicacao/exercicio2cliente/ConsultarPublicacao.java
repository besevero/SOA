
package exercicio2cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consultarPublicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultarPublicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tituloPublicacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPublicacao", propOrder = {
    "tituloPublicacao"
})
public class ConsultarPublicacao {

    protected String tituloPublicacao;

    /**
     * Obtém o valor da propriedade tituloPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloPublicacao() {
        return tituloPublicacao;
    }

    /**
     * Define o valor da propriedade tituloPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloPublicacao(String value) {
        this.tituloPublicacao = value;
    }

}
