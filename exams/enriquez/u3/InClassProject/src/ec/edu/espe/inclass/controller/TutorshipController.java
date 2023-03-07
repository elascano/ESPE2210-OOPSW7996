package ec.edu.espe.inclass.controller;

import com.google.gson.Gson;
import ec.edu.espe.inclass.model.Tutorship;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class TutorshipController {

    public static ArrayList loadTutorships(ArrayList<String> jsons) {
        ArrayList<Tutorship> tutorships;
        tutorships = new ArrayList<>();

        for (String json : jsons) {
            tutorships.add(convertJsonToTutorship(json));
        }

        return tutorships;
    }

    public static Tutorship convertJsonToTutorship(String json) {
        Tutorship tutorship;
        Gson gson;
        gson = new Gson();
        tutorship = new Tutorship();
        
        tutorship = gson.fromJson(json, tutorship.getClass());

        return tutorship;
    }
}
