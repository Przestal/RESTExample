package com.sda.triangle;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/triangle")
public class TriangleService {

    MathService service = new MathService();

    @GET
    @Path("/zero")
    @Produces("application/json")
    public Result getMsg(@QueryParam("a") int a,@QueryParam("b") int b, @QueryParam("c") int c)
    {
        return service.getResult(a, b, c);
    }

    @GET
    @Path("/field")
    @Produces("application/json")
    public Result field(@QueryParam("x") int x, @QueryParam("h") int h){

        return  service.fieldResult(x, h);

    }


}
