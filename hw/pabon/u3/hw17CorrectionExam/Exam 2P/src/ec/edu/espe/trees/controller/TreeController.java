package ec.edu.espe.trees.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class TreeController{
  
    public void Trees(String id, String color, String type, String size){
    MongoDBConnection mongoDB;
    mongoDB = new MongoDBConnection();
    MongoClient userDB;
    MongoDatabase userdatabase;
    MongoCollection userCollection;
    Document document;

    userDB= mongoDB.conectionMongo();
    userdatabase=userDB.getDatabase("Exam2P");
    userCollection= userdatabase.getCollection("Trees");

    document=new Document();
        
        document.append("id",id);
        document.append("color",color);
        document.append("type",type);
        document.append("size",size);
        
        userCollection.insertOne(document);
        JOptionPane.showMessageDialog(null, "The data has been saved successfully");
        
        
        
    }
    }

    
   
    
    
    

