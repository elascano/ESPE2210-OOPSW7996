package com.mycompany.mongodb;

import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.result.InsertManyResult;
import static java.lang.Compiler.command;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.UpdateResult;
import java.util.Arrays;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class DataBase 
{
   public  void conection()
   {
      
   }
   
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
        String nameProduct;
        int id, quantityProducts;
        float priceProduct;
        boolean salir;
        int chooseOption;
        
        
        //
        int iterator = 1;
        //
        String uri = "mongodb+srv://Jairo:OPP@cluster0.g9jmmds.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoclient = MongoClients.create(uri)) {
            //Conectarse a la base de datos product
            MongoDatabase database = mongoclient.getDatabase("OOP");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("\n\t\t==========================================");
                System.out.println("\t\t\tConnected successfully to server.");
                System.out.println("\t\t==========================================");
               
                MongoCollection<Document> collection = database.getCollection("Product");

                do {
                    System.out.println("==================================================================");
                    System.out.println("\t\t\tMENU");
                    System.out.println("==================================================================");
                    System.out.println("[1]Add Product\n[2]See Product\n[3]Update Product\n[4]See all products\n[5]Delete product");
                    System.out.print("choose option: ");
                    chooseOption = scanner.nextInt();
                    ArrayList<Document> listDocument=new ArrayList<>() ;
                    switch (chooseOption) {
                        case 1: {
                            iterator = 1;
                            do {
                                
                    

                                System.out.println("\n\t\t\tPRODUCT " + iterator + "\n");
                                System.out.println("Enter the product name: ");
                                nameProduct = scanner.next();
                                System.out.println("Enter the product id: ");
                                id = scanner.nextInt();
                                System.out.println("Enter the price of the product: ");
                                priceProduct = scanner.nextFloat();
                                System.out.println("Enter the quantity of the product: ");
                                quantityProducts = scanner.nextInt();
                                System.out.println("Do you want to add another product? true or false");
                                salir = scanner.nextBoolean();
                                if (salir == true) {
                                    iterator++;
                                }
                                //Añade la lista a la base de datos
                                listDocument.add(new Document("Product name", nameProduct).append("Id", id).append("Price", priceProduct).append("Amount", quantityProducts));

                            } while (salir == true);
                            try {
                                //collection.insertOne(listaProductos);
                                InsertManyResult result=collection.insertMany(listDocument);
                                System.out.println("\n\n\t\t PRODUCTS INSERTED CORRECTLY!!");
                                System.out.println("===============================================");
                                System.out.println("\t\t\t REPORT");
                                System.out.println("===============================================");
                                System.out.println("[*]Inserted products  ---> " + iterator);
                                System.out.println("[*]Collection size    ---> " + collection.countDocuments() + " documents");

                            } catch (MongoException me) {
                                System.out.println("Products could not be added " + me);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Enter the id of the product you want to search for: ");
                            id = scanner.nextInt();
                            try {
                                System.out.println("\n\t\tProduct found!\n");
                                Document findDocument = collection.find(Filters.eq("Id", id)).first();
                                System.out.println(findDocument.toJson());
                            } catch (Exception me) {
                                System.out.println("The product was not found in the database");

                            }
                            break;
                        }

                        case 3: {

                            System.out.print("Enter the id of the product you want to update: ");
                            id = scanner.nextInt();
                            try {
                                int newId;
                                System.out.println("------------------------------------------------------------------------");
                                System.out.println("\t\t\tORIGINAL DOCUMENT \n");
                                Document findDocument = collection.find(Filters.eq("Id", id)).first();
                                System.out.println(findDocument.toJson());
                                System.out.println("------------------------------------------------------------------------");
                                System.out.println("Enter the new name product name: ");
                                nameProduct = scanner.next();
                                System.out.print("Enter the new product id: ");
                                newId = scanner.nextInt();
                                System.out.print("Enter the new product price: ");
                                priceProduct = scanner.nextFloat();
                                System.out.print("Enter the quantity of the product: ");
                                quantityProducts = scanner.nextInt();
                                Bson filter = Filters.eq("Id", id);
                                Document document = new Document("Product name", nameProduct).append("Id", newId).append("Price", priceProduct).append("Amount", quantityProducts);
                                UpdateResult result = collection.replaceOne(filter, document);
                                System.out.println("Modificado " + result.getModifiedCount());
                                System.out.println("===============================================");
                                System.out.println("\t\t\t REPORT");
                                System.out.println("===============================================");
                                System.out.println("\t\tTHE FILE HAS BEEN MODIFIED CORRECTLY");

                            } catch (Exception me) {
                                System.out.println("The product was not found in the database");
                            }
                            break;

                        }
                        case 4: {
                            MongoCursor cursor = collection.find().iterator();
                            System.out.println("\n\t\t\tProducts found in the database\n");
                            try {
                                while (cursor.hasNext()) {
                                    System.out.println(cursor.next());
                                }

                            } finally {
                                cursor.close();
                            }
                            break;
                        }
                        case 5: {//Borrar datos
                            System.out.print("Enter the Id of the product you want to delete: ");
                            id = scanner.nextInt();
                            Bson deleteBson = eq("Id", id);
                            collection.deleteOne(deleteBson);
                            System.out.println("Product removed from the database");

                            break;

                        }

                    }

                } while (chooseOption != 6);

            } catch (MongoException e) {
                System.out.println("\n\t\t==========================================");
                System.out.println("\t\t\tAn error occurred while attempting to connect:");
                System.out.println("\t\t==========================================");
            }
        }

    }
}
