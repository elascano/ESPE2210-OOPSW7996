
package ec.edu.espe.code.controller;

import com.google.gson.Gson;
import ec.edu.espe.code.model.Car;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class DBManager {
    public static SoccerPlayer jsonToSoccerPlayers(String json) {
        SoccerPlayer soccerPlayer;
        Gson gson;
        String name = "";
        String model = "";
        int age = 0;
        String color = "";

        soccerPlayer = new SoccerPlayer(name,age);
        gson = new Gson();

        soccerPlayer = gson.fromJson(json, soccerPlayer.getClass());
        
        return soccerplayer;

    }
    
    public static ArrayList loadCourses(ArrayList<String> jsons) {
        ArrayList<Course> courses;        
        courses = new ArrayList<>();
        
        for (String json : jsons) {
            courses.add(jsonToCourse(json));
        }
        
        return courses;
    }
        

    
}
