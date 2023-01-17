package ec.edu.espe.managementsoftware;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.controller.ProductController;
import ec.edu.espe.model.Material;
import ec.edu.espe.model.Product;
import java.util.ArrayList;
import utils.DbManager;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ManagementSoftwareConsole {

    public static void main(String[] args) {
        try{
            Product product;
            ArrayList<Material> array  =new ArrayList<>();
            product  = new Product(350, "Prueba 2", 1.5F , "Navidad", array , 5, 100);
            ArrayList productAttributesNames = Product.getAttributesNames();
            ArrayList productAttributes = Product.getAttributes(product);
            
            MongoCollection productCollection = DbManager.createConnection("Products");
            DbManager.insert(productCollection, productAttributesNames, productAttributes);
            System.out.println(productAttributesNames);
            System.out.println(productAttributes);
            
            Material material;
            material = new Material(1, "Palitos prueba",10, 150.0F);
            ArrayList materialAttributesNames = Material.getAttributesNames();
            ArrayList materialAttributes = Material.getAttributes(material);
            MongoCollection materialCollection = DbManager.createConnection("Materials");
            DbManager.insert(materialCollection, materialAttributesNames, materialAttributes);
            //ProductController.runMenu(productCollection);
        }catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    } 
}
