package ec.edu.espe.q61.controller;

import com.google.gson.Gson;
import ec.edu.espe.q61.model.Professor;
import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ProfessorController {

    public static ArrayList loadProfessor(ArrayList<String> jsons) {
        ArrayList<Professor> professor;
        professor = new ArrayList<>();

        for (String json : jsons) {
            professor.add(jsonToProfessor(json));
        }

        return professor;
    }

    public static Professor jsonToProfessor(String json) {
        Professor professor;
        Gson gson;
        gson = new Gson();
        int id = 0;
        String name = "";
        int age = 0;
        professor = new Professor(id, name, age);

        professor = gson.fromJson(json, professor.getClass());

        return professor;
    }
}
