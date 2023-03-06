
package microservices;

import java.awt.PageAttributes.MediaType;
import javax.ws.rs.*;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
@Path("/users")
public class UserService {

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public User createUser(@FormParam("username") String username, @FormParam("password") String password) {
    // código para crear al usuario con los datos proporcionados
    return user;
  }
  
  @PUT
  @Path("/{userId}")
  @Produces(MediaType.APPLICATION_JSON)
  public User updateUser(@PathParam("userId") int userId, @FormParam("username") String username, @FormParam("password") String password) {
    // código para actualizar al usuario con los datos proporcionados
    return user;
  }
}

