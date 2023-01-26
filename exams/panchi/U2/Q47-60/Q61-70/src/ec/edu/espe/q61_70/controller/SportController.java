
package ec.edu.espe.q61_70.controller;

import org.bson.Document;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SportController extends CrudMongoDBController implements Sport{

    public SportController(String mongoCollection) {
        super(mongoCollection);
    }

    @Override
    public Document RegisterAndBuildDocument(String id, String name, String isInTeam) {
        Document document = new Document("id", id)
                .append("name", name)
                .append("Is in team", isInTeam);
        return document;
    }
    
}
