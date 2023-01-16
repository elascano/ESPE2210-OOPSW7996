package ec.edu.espe.professor.controller;

import com.google.gson.Gson;
import ec.edu.espe.professor.model.Professor;
import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ProfessorController {

    public static ArrayList loadProfessor(ArrayList<String> jsons) {
        ArrayList<Professor> students;
        students = new ArrayList<>();

        for (String json : jsons) {
            students.add(jsonToProfessor(json));
        }

        return students;
    }

    public static Professor jsonToProfessor(String json) {
        Professor student;
        Gson gson;
        gson = new Gson();
        int id = 0;
        String name="";
        int age= 0;
        student = new Professor(id, name, age);

        student = gson.fromJson(json, student.getClass());

        return student;
    }
}
