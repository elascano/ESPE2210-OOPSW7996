
package ec.edu.espe.AirporTaxiScheduling.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.AirporTaxiScheduling.model.Tarif;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TarifDbController {
    
    
    static public MongoClient conection(){
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        return mongoClient;
    }
     public static ArrayList<Tarif> loadFromDatabase(ArrayList<Tarif> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("kilometres", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), Tarif.class)));
        return objects;
    }
    
     public static void uploadDocumentMdb(Tarif tarif) {
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            try {
                System.out.println("Connected successfully to server(AirporTaxiScheduing).");

                 MongoCollection<Document> collection = database.getCollection("Tarifs");
        Document inspection = new Document("_id", new ObjectId())
                .append("exitAdress", tarif.getExitAdress())
                .append("arrivalAdress", tarif.getArrivalAdress())
                .append("kilometres", tarif.getKilometres())
                .append("valueToPay", tarif.getValueToPay());
        collection.insertOne(inspection);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
 