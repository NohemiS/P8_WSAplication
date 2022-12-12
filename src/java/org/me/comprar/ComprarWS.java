/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package org.me.comprar;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Nohemi
 */
@WebService(serviceName = "ComprarWS")
@Stateless()
public class ComprarWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Comprar")
    public boolean Comprar(@WebParam(name = "id_producto") int id_producto, @WebParam(name = "precio") float precio, @WebParam(name = "numero_productos") int numero_productos, @WebParam(name = "total") float total) {
        //TODO write your implementation code here:
        String mensaje = "Llenado de datos finalizado";
        return true;
    }
}
