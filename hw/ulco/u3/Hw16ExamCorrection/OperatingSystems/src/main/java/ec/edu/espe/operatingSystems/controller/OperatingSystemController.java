
package ec.edu.espe.operatingSystems.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.operatingSystems.model.OperatingSystem;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.MongoDBManager;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class OperatingSystemController {

    public static void Add(OperatingSystem operatingSystem) {
       MongoDBManager.Create(operatingSystem);
    }  
    
    public static ArrayList<OperatingSystem> View(ArrayList<OperatingSystem> objects, MongoDatabase database, String collectionName) {
        MongoDBManager.Read(database, collectionName, objects);
        return objects;
    }

   
    

}


