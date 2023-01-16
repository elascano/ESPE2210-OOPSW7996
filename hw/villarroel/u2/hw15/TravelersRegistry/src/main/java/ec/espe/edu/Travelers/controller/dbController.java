
package ec.espe.edu.Travelers.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.espe.edu.Travelers.model.Traveler;
import ec.espe.edu.Travelers.view.TravelersPanel;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class dbController {
    static public MongoClient conection(){
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        return mongoClient;
    }
    
    static public void uploadDocumentMdb(Traveler traveler){
        MongoClient mongoClient = dbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        String status = "done";
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", traveler.getId())
                .append("name", traveler.getName())
                .append("phoneNumber", traveler.getPhoneNumber())
                .append("mail", traveler.getMail())
                .append("outstandingBalance", traveler.getOutstandingBalance())
                .append("status", status);

        collection.insertOne(inspection);
    }
    
    public static Traveler findDocumentdb(Traveler traveler, int idFinder){
        MongoClient mongoClient = dbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(collection.find(filter).first() != null){
            Document document = collection.find(filter).first();
            traveler.setName(document.getString("name"));
            traveler.setPhoneNumber(document.getLong("phoneNumber"));
            traveler.setMail(document.getString("mail"));
            traveler.setOutstandingBalance(Float.valueOf(Double.toString(document.getDouble("outstandingBalance"))));
        }else{
            TravelersPanel.messege();
        }
        
        return traveler;
    }
    
    public static void deleteDocument(int idFinder){
        MongoClient mongoClient = dbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(collection.find(filter).first() != null){
            collection.deleteOne(filter);
            JOptionPane.showMessageDialog( null,"Document delete successfully");
        }else{
            TravelersPanel.messege();
        }
    }
    
    public static void updateDocumentdb(Traveler traveler, int idFinder){
        MongoClient mongoClient = dbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Bson query = Filters.eq("id", idFinder);
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(collection.find(filter).first() != null){
            Bson updates = Updates.combine(Updates.set("name", traveler.getName()),
                    Updates.set("phoneNumber",traveler.getPhoneNumber()),
                    Updates.set("mail", traveler.getMail()),
                    Updates.set("outstandingBalance", traveler.getOutstandingBalance()));
            collection.updateOne(query, updates);
            JOptionPane.showMessageDialog( null,"Document updated successfully");
        }else{
            TravelersPanel.messege();
        }
    }
}
