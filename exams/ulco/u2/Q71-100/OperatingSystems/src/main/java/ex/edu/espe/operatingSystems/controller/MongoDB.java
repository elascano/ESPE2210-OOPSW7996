
package ex.edu.espe.operatingSystems.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ex.edu.espe.operatingSystems.model.OperatingSystem;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Labs-DCCO
 */
public class MongoDB {
     
  public static void insertOperatingSystem(OperatingSystem operatingSystem) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("OperatingSystems");
            try {
                System.out.println("Connected successfully to server(Traveler).");

                MongoCollection<Document> collection = database.getCollection("OperatingSystem");

                Document operatingSystems = new Document("_id", new ObjectId())
                        .append("id", operatingSystem.getId())
                        .append("name", operatingSystem.getName())
                        .append("version", operatingSystem.getVersion())
                        .append("year",operatingSystem.getYear());

                collection.insertOne(operatingSystems);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
  }
  
  
  
  
  
  public static void updateOperatingSystem(OperatingSystem operatingSystem) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("OperatingSystems");

            try {

                MongoCollection collection = database.getCollection("OperatingSystem");

                Bson filter = Filters.eq("id", operatingSystem.getId());

                Bson updates = Updates.combine(Updates.set("id", operatingSystem.getId()),
                        Updates.set("id",operatingSystem.getId() ),
                                    Updates.set("name",operatingSystem.getName()),
                        Updates.set("version",operatingSystem.getVersion() ),
                        Updates.set("year",operatingSystem.getYear()));

                collection.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
   public static void deleteOperatingSystem(OperatingSystem operatingSystem) {

        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("OperatingSystems");
            try {
                MongoCollection collectionDriver = database.getCollection("OperatingSystem");

                Bson filter = Filters.eq("id",operatingSystem.getId());
                collectionDriver.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    public static OperatingSystem findOperatingSystem (OperatingSystem operatingSystem) {
        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("OperatingSystems");
            try {
                MongoCollection<Document> collectionDriver = database.getCollection("OperatingSystem");

                Bson filter = Filters.eq("id", operatingSystem.getId());
                try {
                    Document doc = collectionDriver.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<OperatingSystem> type = new TypeToken<OperatingSystem>() {
                    };
                    operatingSystem = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return operatingSystem;
    }
}
