
package ec.edu.espe.truck.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.truck.model.Truck;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Controller {


    public static Truck readMongo(MongoDatabase database, int id) {
        
        Truck truck;
        String document = "";
        Gson gson = new Gson();
        MongoCollection <Document> collection = database.getCollection("trucks");

        Bson filter = Filters.eq("id", id);
        Document query = collection.find(Filters.and(filter)).first();
        document = query.toJson();
        
        TypeToken<Truck> type = new TypeToken<Truck>() {};
        truck = gson.fromJson(document, type.getType());
        
        return truck;
    }
}
