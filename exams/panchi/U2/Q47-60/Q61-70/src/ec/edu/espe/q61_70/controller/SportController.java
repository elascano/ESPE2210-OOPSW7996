/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public Document RegisterAndBuildDocument(int id, String name, boolean isInTeam) {
        Document document = new Document("id", id)
                .append("name", name)
                .append("Is in team", isInTeam);
        return document;
    }
    
}
