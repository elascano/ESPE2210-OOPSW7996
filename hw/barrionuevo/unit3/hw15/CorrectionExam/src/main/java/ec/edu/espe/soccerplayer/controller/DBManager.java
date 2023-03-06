
package ec.edu.espe.soccerplayer.controller;

import ec.edu.espe.soccerplayer.model.SoccerPlayer;
import java.util.ArrayList;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class DBManager {
    public static SoccerPlayer toSoccerPlayer(Object[] soccerPlayerAttribute) {
        SoccerPlayer soccerPlayer;

        soccerPlayer = new SoccerPlayer((String) soccerPlayerAttribute[0], (String) soccerPlayerAttribute[1], (String) soccerPlayerAttribute[2]);

        return soccerPlayer;
    }

    public static ArrayList read(ArrayList<Object> studentsList) {
        ArrayList<SoccerPlayer> soccerPlayers;
        Object[] soccerPlayerAttribute;

        soccerPlayers = new ArrayList<>();

        for (int i = 0; i < studentsList.size(); i++) {
            soccerPlayerAttribute = (Object[]) studentsList.get(i);
            soccerPlayers.add(toSoccerPlayer(soccerPlayerAttribute));
        }

        return soccerPlayers;
    }
}
