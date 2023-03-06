package ec.edu.espe.StrategyPattern.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class MongoDbAccess {

          static public MongoClient conection() {
                    String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
                    MongoClient mongoClient = MongoClients.create(uri);
                    return mongoClient;
          }
          
}
