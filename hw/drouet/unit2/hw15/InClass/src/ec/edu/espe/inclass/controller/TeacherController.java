package ec.edu.espe.inclass.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ec.edu.espe.inclass.model.Teacher;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class TeacherController {
    public static String teacherToJsonForDB(Teacher teacher) {        
        String json;        
        JsonObject rootObject = new JsonObject();     
        
        rootObject.addProperty("name", teacher.getName());
        rootObject.addProperty("espeId", teacher.getEspeId());
        
        json = rootObject.toString();
                      
        return json;
    }
    
    public static Teacher jsonToTeacher(String json) {
        Teacher teacher;
        Gson gson;
        gson = new Gson();
        teacher = new Teacher();
        
        teacher = gson.fromJson(json, teacher.getClass());

        return teacher;
    }
}
