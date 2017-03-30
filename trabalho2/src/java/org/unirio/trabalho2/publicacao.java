/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unirio.trabalho2;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author labccet
 */
@WebService(serviceName = "publicacao")
public class publicacao {

    /**
     * Operação de Web service
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "operacaoTeste")
    public ArrayList<Publicacoes> operacaoTeste(@WebParam(name = "titulo") String txt) {
        ArrayList<Publicacoes> resposta = new ArrayList<>();
        
        
        return resposta;
    }

  
}
