/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SOA;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author labccet
 */
@WebService(serviceName = "PrimeiraAula")
public class PrimeiraAula {
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "concatenar")
    public String concatenar(@WebParam(name = "str1") String str1, @WebParam(name = "str2") String str2) {
        //TODO write your implementation code here:
        return str1 + " " + str2;
    }

}
