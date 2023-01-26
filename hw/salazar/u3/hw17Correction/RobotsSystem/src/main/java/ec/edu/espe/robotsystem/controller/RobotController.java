package ec.edu.espe.robotsystem.controller;

import ec.edu.espe.robotsystem.model.Robot;
import org.bson.Document;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class RobotController {

    public static Document toDocument(Robot robot) {
        
        Document robotAdded = new Document();
        robotAdded.append("_id", robot.getId())
                .append("funtion", robot.getFuntion())
                .append("age", robot.getAge());
        
        return robotAdded;
    }

}
