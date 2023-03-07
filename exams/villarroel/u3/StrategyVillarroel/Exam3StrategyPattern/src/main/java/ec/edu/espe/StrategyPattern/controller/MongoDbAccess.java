package ec.edu.espe.StrategyPattern.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class MongoDbAccess {

          static public MongoClient conection() {
                    String uri = "mongodb+srv://JoshSy01:060903@cluster0.2sziitx.mongodb.net/test";
                    MongoClient mongoClient = MongoClients.create(uri);
                    return mongoClient;
          }
          
}
