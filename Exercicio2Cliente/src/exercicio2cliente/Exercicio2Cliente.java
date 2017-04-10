/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2cliente;

import java.util.ArrayList;
import java.util.List;
import servico.Autor;
import servico.Exception_Exception;

/**
 *
 * @author Bernardo
 */
public class Exercicio2Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception_Exception {
        // TODO code application logic here
        String nome = "Leonardo Guerreiro Azevedo";
        List<Autor> resultado = consultarAutor(nome);
        if(resultado.isEmpty()) {
            System.out.println("Resultados não encontrados");
        }
        else{
            for(int i = 0; i < resultado.size(); i++){
                System.out.println(resultado.get(i).getId());
                System.out.println(resultado.get(i).getNome());
                System.out.println(resultado.get(i).getNomeDeCitacao());
                System.out.println(resultado.get(i).getCpf());
            }
        }
        
        /*Autor inserirAutor = new Autor();
        inserirAutor.setNome("Gleison do Santos Souza");
        inserirAutor.setNomeDeCitacao("SANTOS");
        inserirAutor.setCpf(461620238);
        criarAutor(inserirAutor);*/
        
        /*Autor atualizar = new Autor();
        atualizar.setNome("Gleison do Santos Souza");
        atualizar.setNomeDeCitacao("SANTOS");
        atualizar.setCpf(46162023);
        atualizarAutor(atualizar,"Gleison do Santos Souza");*/
        
        //excluirAutor("Gleison do Santos Souza");
    }

    private static java.util.List<servico.Autor> consultarAutor(java.lang.String nomeAutor) throws Exception_Exception {
        servico.ServicoConsulta_Service service = new servico.ServicoConsulta_Service();
        servico.ServicoConsulta port = service.getServicoConsultaPort();
        return port.consultarAutor(nomeAutor);
    }

    private static void criarAutor(servico.Autor autor) {
        servico.ServicoConsulta_Service service = new servico.ServicoConsulta_Service();
        servico.ServicoConsulta port = service.getServicoConsultaPort();
        port.criarAutor(autor);
    }

    private static void atualizarAutor(servico.Autor autor, java.lang.String nomeAtualizar) {
        servico.ServicoConsulta_Service service = new servico.ServicoConsulta_Service();
        servico.ServicoConsulta port = service.getServicoConsultaPort();
        port.atualizarAutor(autor, nomeAtualizar);
    }

    private static void excluirAutor(java.lang.String nome) {
        servico.ServicoConsulta_Service service = new servico.ServicoConsulta_Service();
        servico.ServicoConsulta port = service.getServicoConsultaPort();
        port.excluirAutor(nome);
    }

    

    
    
}
