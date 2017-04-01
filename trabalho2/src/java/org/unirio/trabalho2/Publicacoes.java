/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unirio.trabalho2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author labccet
 */
public class Publicacoes {
    private int id, paginaInicial, paginaFinal;
    private String titulo, dataPublicacao;
    private ArrayList<Publicacoes> lista = new ArrayList<>(); 
    
   
    public Publicacoes(){ 
        
        Publicacoes a = new Publicacoes(1, 1, 300, "O guia do mochileiro", "01-01-2017");
        Publicacoes b = new Publicacoes(2, 1, 170, "Frankenstein", "02-14-1887");
        Publicacoes c = new Publicacoes(3, 1, 400, "Moby Dick", "01-12-1796");
        Publicacoes d = new Publicacoes(4, 1, 280, "O senhor dos aneis", "02-01-1948");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);}

   public Publicacoes(int id, int paginaInicial, int paginaFinal, String titulo, String dataPublicacao){
       this.id = id;
       this.paginaInicial = paginaInicial;
       this.paginaFinal = paginaFinal;
       this.titulo = titulo;
       this.dataPublicacao = dataPublicacao;
       
   }
    
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
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * @param dataPublicacao the dataPublicacao to set
     */
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    /**
     * @return the lista
     */
    public ArrayList<Publicacoes> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Publicacoes> lista) {
        this.lista = lista;
    }
    
    
}
