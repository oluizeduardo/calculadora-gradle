package rest.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalcService {

	
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result soma(@QueryParam("a") int a, @QueryParam("b") int b);
	
	
	@POST
	@Path("/sub")
	@Produces(MediaType.APPLICATION_JSON)
	Result subtrai(@FormParam("a") int a, @FormParam("b") int b);
	
}
