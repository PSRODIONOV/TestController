package general;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/test2")
public class JersController {

    @GET
    @Path("/hello")
    public String printHello(){
        return "HELLO WORLD FROM JERSEY";
    }
}
