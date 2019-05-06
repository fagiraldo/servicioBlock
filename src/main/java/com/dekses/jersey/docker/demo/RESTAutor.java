/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekses.jersey.docker.demo;

import com.dekser.docker.model.Archivo;
import com.dekser.docker.model.Autor;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author fabian.giraldo
 */
@Path("autor")
public class RESTAutor {
        
    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public List<Autor> listarAutores() {
        ArrayList<Autor> autores = new ArrayList<>();
        Autor autor = new Autor();
        autor.setNombre("nombre");
        autor.setApellido("apellido");
        autor.setTelefono("123");
        autor.setDireccion("12345");
        autores.add(autor);
        autores.add(autor);
        return autores;
    }
    
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{direccion}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Autor consultarAutor(@PathParam("direccion") String direccion) {
        Autor autor = new Autor();
        autor.setNombre("nombre");
        autor.setApellido("apellido");
        autor.setTelefono("123");
        autor.setDireccion("12345");
        return autor;
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    public Autor registrarAutor(Autor autor) {
        return autor;
    }
    
    
}
