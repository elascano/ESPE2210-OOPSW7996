package ec.edu.espe.ehamanagement.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.model.User;
import ec.edu.espe.mongodbmanager.MongoDbManager;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Profile {
    
    public static boolean updateUser(User user, MongoCollection userCollection){
        MongoDbManager.updateDocument(userCollection, "id",1, "userName", user.getUserName());
        MongoDbManager.updateDocument(userCollection,"id", 1, "email", user.getEmail());
        MongoDbManager.updateDocument(userCollection, "id",1, "password", user.getPassword());
        MongoDbManager.updateDocument(userCollection, "id",1, "currentSalary", user.getCurrentSalary());
        return true;
    }
    
    public static boolean deleteUser( int id, MongoCollection userCollection){
        return MongoDbManager.deleteDocument(userCollection, "id", id);
    }
    
    public static Object getValueFromUser(MongoCollection userCollection, int id, String key){
        Object foundValue;
        foundValue = MongoDbManager.getDocumentValue(userCollection, "id",id, key);
        return foundValue;
    }
}
