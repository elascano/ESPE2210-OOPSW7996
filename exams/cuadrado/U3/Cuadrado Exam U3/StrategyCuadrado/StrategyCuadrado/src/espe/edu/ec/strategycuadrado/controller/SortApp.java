    package espe.edu.ec.strategycuadrado.controller;
import java.util.Scanner;
/**
 *
 * @author Alejandro Cuadrado, DeveloperBears
 */
public class SortApp {
    public class ConnectionMongoSortApp {
    private static final Scanner sc = new Scanner(System.in);
    public static void insertApp() {
        int id;
        float price;
        String name;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
public class ConnectionMongoSortApp {
    private static final Scanner sc = new Scanner(System.in);
    public static void insertPizza() {
        int id;
        float price;
        String name;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("SortApp");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionPizza = database.getCollection("menu");
                MongoCollection<Document> collectionIva = database.getCollection("id");
                System.out.print("\nEnter the id: ");
                id = sc.nextInt();                  
                
                
                
    /*https://github.com/elascano/ESPE2210-OOPSW7996.git */
}
        }