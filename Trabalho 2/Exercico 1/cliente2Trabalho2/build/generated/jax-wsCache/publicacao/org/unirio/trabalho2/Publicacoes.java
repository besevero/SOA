
package org.unirio.trabalho2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de publicacoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="publicacoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lista" type="{http://trabalho2.unirio.org/}publicacoes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paginaFinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paginaInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicacoes", propOrder = {
    "dataPublicacao",
    "id",
    "lista",
    "paginaFinal",
    "paginaInicial",
    "titulo"
})
public class Publicacoes {

    protected String dataPublicacao;
    protected int id;
    @XmlElement(nillable = true)
    protected List<Publicacoes> lista;
    protected int paginaFinal;
    protected int paginaInicial;
    protected String titulo;

    /**
     * Obtém o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPublicacao(String value) {
        this.dataPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publicacoes }
     * 
     * 
     */
    public List<Publicacoes> getLista() {
        if (lista == null) {
            lista = new ArrayList<Publicacoes>();
        }
        return this.lista;
    }

    /**
     * Obtém o valor da propriedade paginaFinal.
     * 
     */
    public int getPaginaFinal() {
        return paginaFinal;
    }

    /**
     * Define o valor da propriedade paginaFinal.
     * 
     */
    public void setPaginaFinal(int value) {
        this.paginaFinal = value;
    }

    /**
     * Obtém o valor da propriedade paginaInicial.
     * 
     */
    public int getPaginaInicial() {
        return paginaInicial;
    }

    /**
     * Define o valor da propriedade paginaInicial.
     * 
     */
    public void setPaginaInicial(int value) {
        this.paginaInicial = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
