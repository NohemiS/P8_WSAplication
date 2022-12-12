/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package org.me.pagar;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Nohemi
 */
@WebService(serviceName = "PagarWS")
@Stateless()
public class PagarWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Pagar")
    public boolean Pagar(@WebParam(name = "numero_tarjeta") int numero_tarjeta, @WebParam(name = "monto") float monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "codigo_cvv") int codigo_cvv) {
        //System.out.println("No se puede realizar compra");
        if(monto>1000){
            return false;}
        else{
        return true;
        }
    }
}
