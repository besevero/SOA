/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2cliente;

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
     * @throws servico.Exception_Exception
     * @throws exercicio2cliente.Exception_Exception
     */
    public static void main(String[] args) throws Exception_Exception, exercicio2cliente.Exception_Exception {
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
        /*
        Autor inserirAutor = new Autor();
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
        
        String titulo= "ResearchOps: The case for DevOps in scientific applications";
        List<Publicacao> resultadoPublicacao = consultarPublicacao(titulo);
        if(resultado.isEmpty()) {
            System.out.println("Resultados não encontrados");
        }
        else{
            for(int i = 0; i < resultado.size(); i++){
                System.out.println(resultadoPublicacao.get(i).getId());
                System.out.println(resultadoPublicacao.get(i).getTitulo());
                System.out.println(resultadoPublicacao.get(i).getPaginaInicial());                        
                System.out.println(resultadoPublicacao.get(i).getPaginaFinal());
                System.out.println(resultadoPublicacao.get(i).getDataPublicacao());
            }
        }
        
/*
        Publicacao inserirPublicacao = new Publicacao();
        inserirPublicacao.setTitulo("Avaliação do Processo de Medição em Gerência de Incidentes");
        inserirPublicacao.setPaginaInicial(58);
        inserirPublicacao.setPaginaFinal(77);
        inserirPublicacao.setDataPublicacao("1991");
        criarPublicacao(inserirPublicacao);
        */
   /*   Publicacao atualizarPublicacao = new Publicacao();
        atualizarPublicacao.setTitulo("Avaliação do Processo de Medição em Gerência de Incidentes");
        atualizarPublicacao.setPaginaInicial(58);
        atualizarPublicacao.setPaginaFinal(77);
        atualizarPublicacao.setDataPublicacao("2015");
        atualizarPublicacao(atualizarPublicacao,"Avaliação do Processo de Medição em Gerência de Incidentes");
        */
      // excluirPublicacao("An Automated Approach for Scheduling Bug Fix Tasks");
            
     
    }

    private static void atualizarAutor(servico.Autor autor, java.lang.String nomeAtualizar) {
        servico.ServicoConsulta service = new servico.ServicoConsulta();
        servico.ServicoAutor port = service.getServicoAutorPort();
        port.atualizarAutor(autor, nomeAtualizar);
    }

    private static java.util.List<servico.Autor> consultarAutor(java.lang.String nomeAutor) throws Exception_Exception {
        servico.ServicoConsulta service = new servico.ServicoConsulta();
        servico.ServicoAutor port = service.getServicoAutorPort();
        return port.consultarAutor(nomeAutor);
    }

    private static void criarAutor(servico.Autor autor) {
        servico.ServicoConsulta service = new servico.ServicoConsulta();
        servico.ServicoAutor port = service.getServicoAutorPort();
        port.criarAutor(autor);
    }

    private static void excluirAutor(java.lang.String autor) {
        servico.ServicoConsulta service = new servico.ServicoConsulta();
        servico.ServicoAutor port = service.getServicoAutorPort();
        port.excluirAutor(autor);
    }

    private static void atualizarPublicacao(exercicio2cliente.Publicacao pubicacao, java.lang.String tituloAtualizar) {
        exercicio2cliente.ServicoPublicacao_Service service = new exercicio2cliente.ServicoPublicacao_Service();
        exercicio2cliente.ServicoPublicacao port = service.getServicoPublicacaoPort();
        port.atualizarPublicacao(pubicacao, tituloAtualizar);
    }

    private static java.util.List<exercicio2cliente.Publicacao> consultarPublicacao(java.lang.String tituloPublicacao) throws exercicio2cliente.Exception_Exception {
        exercicio2cliente.ServicoPublicacao_Service service = new exercicio2cliente.ServicoPublicacao_Service();
        exercicio2cliente.ServicoPublicacao port = service.getServicoPublicacaoPort();
        return port.consultarPublicacao(tituloPublicacao);
    }

    private static void criarPublicacao(exercicio2cliente.Publicacao publicacao) {
        exercicio2cliente.ServicoPublicacao_Service service = new exercicio2cliente.ServicoPublicacao_Service();
        exercicio2cliente.ServicoPublicacao port = service.getServicoPublicacaoPort();
        port.criarPublicacao(publicacao);
    }

    private static void excluirPublicacao(java.lang.String titulo) {
        exercicio2cliente.ServicoPublicacao_Service service = new exercicio2cliente.ServicoPublicacao_Service();
        exercicio2cliente.ServicoPublicacao port = service.getServicoPublicacaoPort();
        port.excluirPublicacao(titulo);
    }
         
    

    

    
    
}
