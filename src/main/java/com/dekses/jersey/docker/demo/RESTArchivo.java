/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekses.jersey.docker.demo;

import com.dekser.docker.model.Archivo;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author fabian.giraldo
 */
@Path("archivo")
public class RESTArchivo {
   
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{hash}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Archivo obtenerInformacionArchivo(@PathParam("hash") String hash) {
        Archivo archivo = new Archivo();
        archivo.setDireccion("direccion");
        archivo.setHash(hash);
        archivo.setUrl("www.url.com");
        return archivo;
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    public Archivo certificarArchivo(Archivo archivo) {
        return archivo;
    }
    
}
