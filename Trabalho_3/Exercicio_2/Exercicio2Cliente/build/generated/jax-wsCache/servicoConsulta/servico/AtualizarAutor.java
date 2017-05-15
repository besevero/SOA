
package servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atualizarAutor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atualizarAutor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autor" type="{http://Servico/}autor" minOccurs="0"/>
 *         &lt;element name="nomeAtualizar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atualizarAutor", propOrder = {
    "autor",
    "nomeAtualizar"
})
public class AtualizarAutor {

    protected Autor autor;
    protected String nomeAtualizar;

    /**
     * Obtém o valor da propriedade autor.
     * 
     * @return
     *     possible object is
     *     {@link Autor }
     *     
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Define o valor da propriedade autor.
     * 
     * @param value
     *     allowed object is
     *     {@link Autor }
     *     
     */
    public void setAutor(Autor value) {
        this.autor = value;
    }

    /**
     * Obtém o valor da propriedade nomeAtualizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAtualizar() {
        return nomeAtualizar;
    }

    /**
     * Define o valor da propriedade nomeAtualizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAtualizar(String value) {
        this.nomeAtualizar = value;
    }

}
