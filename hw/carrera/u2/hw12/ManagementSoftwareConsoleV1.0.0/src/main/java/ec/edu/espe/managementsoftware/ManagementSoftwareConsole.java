package ec.edu.espe.managementsoftware;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.controller.ProductController;
import utils.DbManager;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ManagementSoftwareConsole {

    public static void main(String[] args) {
        try{
            MongoCollection productCollection = DbManager.createConnection("Products");
            ProductController.runMenu(productCollection);
        }catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    } 
}
