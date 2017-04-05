/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Bernardo
 */
public class Autor {

    private int id, cpf;
    private String nome;
    private String nome_de_citacao;
    
    public Autor(){};
   
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
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome_de_citacao
     */
    public String getNome_de_citacao() {
        return nome_de_citacao;
    }

    /**
     * @param nome_de_citacao the nome_de_citacao to set
     */
    public void setNome_de_citacao(String nome_de_citacao) {
        this.nome_de_citacao = nome_de_citacao;
    }
}
