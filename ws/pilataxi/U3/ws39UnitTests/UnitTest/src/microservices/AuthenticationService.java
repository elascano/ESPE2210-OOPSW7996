
package microservices;

import java.awt.PageAttributes.MediaType;
import javax.ws.rs.*;


/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
// Servicio de usuarios
@Path("/auth")
public class AuthenticationService {

  @POST
  @Path("/login")
  @Produces(MediaType.APPLICATION_JSON)
  public Response login(@FormParam("username") String username, @FormParam("password") String password) {
    // código para autenticar al usuario
    if (userAuthenticated) {
      String token = generateToken();
      return Response.ok(token).build();
    } else {
      return Response.status(Response.Status.UNAUTHORIZED).build();
    }
  }
  
  private String generateToken() {
    // código para generar un token de acceso para el usuario autenticado
    return token;
  }
}
