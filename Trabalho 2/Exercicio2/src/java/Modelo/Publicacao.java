/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Bernardo
 */
public class Publicacao {

    private int id, paginaInicial, paginaFinal ;
    private String titulo ;
    private Date dataPublicacao;
    
    public Publicacao(){}
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the paginaInicial
     */
    public int getPaginaInicial() {
        return paginaInicial;
    }

    /**
     * @param paginaInicial the paginaInicial to set
     */
    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    /**
     * @return the paginaFinal
     */
    public int getPaginaFinal() {
        return paginaFinal;
    }

    /**
     * @param paginaFinal the paginaFinal to set
     */
    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the dataPublicacao
     */
    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * @param dataPublicacao the dataPublicacao to set
     */
    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
};