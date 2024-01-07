package cd.tomcat.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/student")
public class StudentUtilityImpl implements StudentUtility {
    @GET
    @Path("/getStudent")
    @Override
    public Student getStudent() {
        Student student = new Student();
        student.setName("Mark");
        student.setAge(21);
        return student;
    }

    @POST
    @Path("/updateName")
    @Override
    public Student updateName(Student student) {
        student.setName("John");
        return student;
    }

    @POST
    @Path("/getAge")
    @Override
    public int getAge(Student student) {
        return student.getAge();
    }
}
