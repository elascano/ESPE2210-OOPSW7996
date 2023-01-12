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
    
    public static boolean validateName(String name) {
        boolean isValid = true;
        
        if (name.length() <= 4) {
            isValid = false;
            return isValid;                
        }
        
        for (char c : name.toCharArray()) {
            if (!(Character.isAlphabetic(c) || Character.isSpaceChar(c))) {
                isValid = false;
                return isValid;                
            }
        }
        
        return  isValid;
    }
    
    public static boolean validateId(String id) {
        boolean isValid = true;
        
        if(id.length() != 9) {
            isValid = false;
            return isValid;
        }
        
        if (!"L".equals(String.valueOf(id.charAt(0)))) {
            isValid = false;
            return isValid;
        }
        
        for (int i = 1; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                isValid = false;
                return isValid;
            }
        }
        
        return  isValid;
    }
    
    public static int findId(ArrayList<Student> students, String id) {
        int index = -1;
        
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getEspeId().equals(id)) {
                index = i;
                return index;
            }
        }
                
        return index;
    }
    
}
