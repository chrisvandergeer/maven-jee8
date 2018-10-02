package nl.cge.jee.war;

import nl.cge.jee.ejb.MySessionBean;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("hello")
public class MyResource {

    @EJB
    private MySessionBean mySessionBean;

    @GET
    @Path("{name}")
    public String helloWorld(@PathParam("name") String name) {
        return mySessionBean.helloWorld(name);
    }

}
