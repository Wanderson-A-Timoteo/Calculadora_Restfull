/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandersontimoteo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author Wanderson de Almeida Timóteo
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of com.wandersontimoteo.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {    
    }
    
    @GET
    @Path("/add/{a},{b},{opt}")
    public int add(@PathParam("a") int a,@PathParam("b") int b,@PathParam("opt") String opt)
    {
            if(opt.equals("+"))
                    return a+b;
            else
                    return 0;
    }
    
    @GET
    @Path("/sub/{a},{b},{opt}")
    public int sub(@PathParam("a") int a,@PathParam("b") int b,@PathParam("opt") String opt)
    {
        if (opt.equals("-"))
            return a-b;
        else
            return 0;
    }
    
    @POST
    @Path("/mul")
    public int mul(@FormParam("a") int a,@FormParam("b") int b,@FormParam("opt") String opt)
    {
        if(opt.equals("*"))
            return a*b;
        else
            return 0;
    }
}
