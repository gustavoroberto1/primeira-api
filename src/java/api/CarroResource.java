package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("carro")
public class CarroResource {

    // POST - HTTP://LOCALHOST:8084/PrimeiraAPI/v1/carro   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registrarCarro() {

        if (true) {
            return Response.status(500).entity(new String("CRIAR CARRO")).build();
        }

        return Response.status(200).entity(new String("CRIAR CARRO")).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String buscarCarros() {
        return "BUSCOU O CARRO";
    }
}
