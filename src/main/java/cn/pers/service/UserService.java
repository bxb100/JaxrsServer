package cn.pers.service;

import cn.pers.domain.Car;
import cn.pers.domain.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by JohnBi on 2017/11/14. 20:42
 *
 * @author Lemon
 * JSON 或者是 XML MIMEType
 */
@Path("/userService")
@Produces("*/*")
public interface UserService {

    @POST
    @Consumes({"application/json","application/xml"})
    @Path("/user")
    void save(User user);

    @DELETE
    @Consumes({"application/json","application/xml"})
    @Path("/user/{id}")
    void delete(@PathParam("id")Integer id);

    @PUT
    @Consumes({"application/json","application/xml"})
    @Path("/user")
    void update(User user);

    @GET
    @Consumes({"application/json","application/xml"})
    @Produces({"application/json","application/xml"})
    @Path("/user/{id}")
    User getOne(@PathParam("id")Integer id);

    @GET
    @Consumes({"application/json","application/xml"})
    @Produces({"application/json","application/xml"})
    @Path("/user")
    List<User> getAll();

    @POST
    @Consumes({"application/json","application/xml"})
    @Produces({"application/json","application/xml"})
    @Path("/user")
    List<Car> findUserCars(User user);
}
