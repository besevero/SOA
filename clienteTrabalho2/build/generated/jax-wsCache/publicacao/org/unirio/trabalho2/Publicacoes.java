
package org.unirio.trabalho2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "paginaFinal",
    "paginaInicial",
    "titulo"
})
public class Publicacoes {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPublicacao;
    protected int id;
    protected int paginaFinal;
    protected int paginaInicial;
    protected String titulo;

    /**
     * Obtém o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPublicacao(XMLGregorianCalendar value) {
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
