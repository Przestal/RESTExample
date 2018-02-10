package com.sda;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Hello World! Get " + msg;
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/{param}")
    public Response postMsg(@PathParam("param") String msg) {
        String output = "Hello World! Post " + msg;
        return Response.status(200).entity(output).build();
    }

    @PUT
    @Path("/{param}")
    public Response putMsg(@PathParam("param") String msg) {
        String output = "Hello World! put " + msg;
        return Response.status(200).entity(output).build();
    }
    @DELETE
    @Path("/{param}")
    public Response delMsg(@PathParam("param") String msg) {
        String output = "Hello World! delete " + msg;
        return Response.status(200).entity(output).build();
    }

}