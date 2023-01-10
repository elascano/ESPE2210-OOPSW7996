package ec.edu.espe.inclass.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import ec.edu.espe.inclass.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class StudentController {
    public static String studentToJsonForDB(Student student, int courseNrc) {        
        String json;
        Gson gson = new Gson();        
        JsonParser parser = new JsonParser();
        
        json = gson.toJson(student);
        JsonElement jsonElement = parser.parse(json);
        JsonObject rootObject = jsonElement.getAsJsonObject();
        
        rootObject.addProperty("nrc", courseNrc);
        
        json = rootObject.toString();
                      
        return json;
    }
    
    public static ArrayList loadStudents(ArrayList<String> jsons) {
        ArrayList<Student> students;        
        students = new ArrayList<>();
        
        for (String json : jsons) {
            students.add(jsonToStudent(json));
        }
        
        return students;
    }
    
    public static Student jsonToStudent(String json) {
        Student student;
        Gson gson;
        gson = new Gson();
        student = new Student();
        
        student = gson.fromJson(json, student.getClass());

        return student;
    }
}
