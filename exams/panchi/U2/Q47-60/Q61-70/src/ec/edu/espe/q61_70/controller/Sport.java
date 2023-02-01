package ec.edu.espe.q61_70.controller;

import org.bson.Document;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public interface Sport {
    
    public Document RegisterAndBuildDocument(String id, String name, String isInTeam);
    
}
