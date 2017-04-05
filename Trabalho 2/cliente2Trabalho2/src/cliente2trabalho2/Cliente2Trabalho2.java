/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente2trabalho2;

import java.util.ArrayList;
import org.unirio.trabalho2.Publicacoes;

/**
 *
 * @author Bernardo
 */
public class Cliente2Trabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Publicacoes> resultado = (ArrayList<Publicacoes>) operacaoTeste("O guia do mochileiro");
        for(int i = 0; i<resultado.size() ; i++){
            System.out.println(resultado.get(i).getTitulo());
            System.out.println(resultado.get(i).getId());
            System.out.println(resultado.get(i).getDataPublicacao());
            System.out.println(resultado.get(i).getPaginaInicial());
            System.out.println(resultado.get(i).getPaginaFinal());
        }
    }

    private static java.util.List<org.unirio.trabalho2.Publicacoes> operacaoTeste(java.lang.String titulo) {
        org.unirio.trabalho2.Publicacao_Service service = new org.unirio.trabalho2.Publicacao_Service();
        org.unirio.trabalho2.Publicacao port = service.getPublicacaoPort();
        return port.operacaoTeste(titulo);
    }
    
}
