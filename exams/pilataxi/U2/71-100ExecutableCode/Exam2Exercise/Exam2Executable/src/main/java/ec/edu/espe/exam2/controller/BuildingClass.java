
package ec.edu.espe.exam2.controller;

import org.bson.Document;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class BuildingClass extends CRUDMongoDB implements BuildingInterface{
    
    public BuildingClass(String mongoCollection) {
        super(mongoCollection);
    } 

    @Override
    public Document RegisterAndBuildDocument(String id, String name, String height) {
        Document document = new Document("id", id)
            .append("Name", name)
            .append("Height", height);

    return document;
    }
}
