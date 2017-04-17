
package exercicio2cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atualizarPublicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atualizarPublicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pubicacao" type="{http://Servico/}publicacao" minOccurs="0"/>
 *         &lt;element name="tituloAtualizar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atualizarPublicacao", propOrder = {
    "pubicacao",
    "tituloAtualizar"
})
public class AtualizarPublicacao {

    protected Publicacao pubicacao;
    protected String tituloAtualizar;

    /**
     * Obtém o valor da propriedade pubicacao.
     * 
     * @return
     *     possible object is
     *     {@link Publicacao }
     *     
     */
    public Publicacao getPubicacao() {
        return pubicacao;
    }

    /**
     * Define o valor da propriedade pubicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Publicacao }
     *     
     */
    public void setPubicacao(Publicacao value) {
        this.pubicacao = value;
    }

    /**
     * Obtém o valor da propriedade tituloAtualizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloAtualizar() {
        return tituloAtualizar;
    }

    /**
     * Define o valor da propriedade tituloAtualizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloAtualizar(String value) {
        this.tituloAtualizar = value;
    }

}
