package ec.edu.espe.hw15.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.gte;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.hw15.model.Product;
import ec.edu.espe.hw15.model.Sale;
import java.util.Scanner;
import org.bson.BsonType;
import static org.bson.BsonType.NULL;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.hw15.model.Employee;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class MongoDB {

    private static final Scanner scanner = new Scanner(System.in);

    public static void saveProduct(Product enteredProduct) {

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Hw15");
            try {
                MongoCollection<Document> productCollection = database.getCollection("Product");

                Document product = new Document("_id", new ObjectId())
                        .append("name", enteredProduct.getName())
                        .append("amount", enteredProduct.getAmout())
                        .append("unit price", enteredProduct.getUnitPrice());

                productCollection.insertOne(product);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    private static void SearchByName(MongoCollection<Document> productCollection) {
        String name;
        System.out.print("Enter the name :\t");
        name = scanner.next();
        System.out.println(name);
        System.out.println("=================");
        Bson filter = Filters.eq("name of Product", name);
        try {
            Document doc = productCollection.find(Filters.and(filter)).first();
            System.out.println("product->" + doc.toJson());

        } catch (Exception e) {
            System.out.println("Data not found");
        }
    }

    public static Product findproduct(Product enteredProduct) {

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        String data;
        Product product = new Product();
        Gson gson = new Gson();
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Hw15");
            try {
                MongoCollection<Document> productCollection = database.getCollection("Product");

                Bson filter = Filters.eq("name", enteredProduct.getName());
                try {
                    Document doc = productCollection.find(Filters.and(filter)).first();

                    String name = (String) doc.get("name");
                    double unitPrice = doc.getDouble("unit price");
                    int amount = (int) doc.get("amount");

                    product.setName(name);
                    product.setUnitPrice(unitPrice);
                    product.setAmout(amount);

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return product;

    }

    public static Employee findEmployee(Employee employee) {
        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        String data;
        employee.setName("Jose");
        Employee employeeNew = new Employee();
        Gson gson = new Gson();
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Hw15");
            try {
                MongoCollection<Document> productCollection = database.getCollection("Employee");

                Bson filter = Filters.eq("name", employee.getName());
                try {
                    Document doc = productCollection.find(Filters.and(filter)).first();

                    String name = (String) doc.get("name");
                    int AmountSold = (int) doc.get("amountSold");
                    int Commission = (int) doc.get("commission");

                    employeeNew.setName(name);
                    employeeNew.setAmountSold(AmountSold);
                    employeeNew.setCommission(Commission);

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return employeeNew;

    }

    public static void eraseProduct(Product product) {

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        System.out.println("___________________________________________________________________________________________");
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Hw15");
            try {

                MongoCollection<Document> productCollection = database.getCollection("Product");

                Bson filter = Filters.eq("name", product.getName());

                while (productCollection.find(filter).first() != null) {

                    productCollection.deleteOne(filter);

                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

    }

    public static void readProduct() {
        int option;
        String name;
        Boolean exit = false;
        int answer;

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        System.out.println("___________________________________________________________________________________________");
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("EcoMarketS");
            try {
                System.out.println("The connection to the EcoMarketS database was successful.");
                System.out.println("_________________________________________________________________________________________");
                MongoCollection<Document> productCollection = database.getCollection("Product");
                option = subMenu();
                while (!exit) {
                    switch (option) {
                        case 1 -> {

                            oneProduct(productCollection, database);
                            exit = true;

                        }
                        case 2 -> {
                            exit = printAllProducts(productCollection);

                        }

                        case 3 ->
                            exit = true;

                        default -> {
                            System.out.println("The options are from 1 to 3");
                            exit = true;
                        }

                    }

                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void updateProduct(String nameInitial, Product enteredProduct) {

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        System.out.println("___________________________________________________________________________________________");
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Hw15");
            try {

                MongoCollection<Document> productCollection = database.getCollection("Product");
                Bson filter = Filters.eq("name", nameInitial);

                Bson productUpdate = Updates.combine(
                        Updates.set("name", enteredProduct.getName()),
                        Updates.set("amount", enteredProduct.getAmout()),
                        Updates.set("unit price", enteredProduct.getUnitPrice())
                );
                productCollection.updateOne(filter, productUpdate);

            } catch (Exception e) {
                System.out.println("Data not found");
            }
        } catch (MongoException me) {
            System.out.println("An error occurred while attempting to connect: " + me);
        }

    }

    public static void updateData() {
        int reply;
        String name;
        String nameNew;
        double unitPriceNew;
        Boolean exit = false;
        Product enteredProduct = new Product();

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        System.out.println("___________________________________________________________________________________________");
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("EcoMarketS");
            try {

                System.out.println("The connection to the EcoMarketS database was successful.");
                System.out.println("_________________________________________________________________________________________");
                MongoCollection<Document> productCollection = database.getCollection("Product");

                reply = subMenuUpdate();

                reply = validateUpdate(reply);

                while (!exit) {
                    switch (reply) {
                        case 1 -> {
                            updateAllProduct(productCollection, enteredProduct);

                            exit = true;

                        }
                        case 2 -> {
                            reply = updateOnlyOne(productCollection, reply);

                            exit = true;
                        }
                        case 3 -> {
                            exit = true;
                        }
                        default -> {
                            System.out.println("You can only select from 1 to 3");
                            exit = true;
                        }

                    }
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteProduct() {
        String nameProductDelete;
        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        System.out.println("___________________________________________________________________________________________");
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("EcoMarketS");
            try {

                System.out.println("The connection to the EcoMarketS database was successful.");
                System.out.println("_________________________________________________________________________________________");
                MongoCollection<Document> productCollection = database.getCollection("Product");

                printAllProducts(productCollection);

                System.out.print("Enter the name of the product to delete:\t");
                nameProductDelete = scanner.next();

                Bson filter = Filters.eq("name of Product", nameProductDelete);

                while (productCollection.find(filter).first() != null) {
                    System.out.println("_______________________________________________________________");
                    productCollection.deleteOne(filter);
                    System.out.println("Product has been successfully removed-->" + nameProductDelete);
                    System.out.println("_______________________________________________________________");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void saleProduct() {
        String nameProductSell;
        int quantity;
        double unitPrice;
        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        System.out.println("___________________________________________________________________________________________");
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("EcoMarketS");
            try {

                System.out.println("The connection to the EcoMarketS database was successful.");
                System.out.println("_________________________________________________________________________________________");
                MongoCollection<Document> productCollection = database.getCollection("Product");
                MongoCollection<Document> saleCollection = database.getCollection("Sale");
                Sale sale = new Sale();

                printAllProducts(productCollection);

                System.out.print("Enter the name of the product to sell:\t");
                nameProductSell = scanner.next();

                System.out.print("Enter the quantity to sell:\t");
                quantity = scanner.nextInt();
                System.out.println("___________________________________________________");

                Bson filter = Filters.eq("name of Product", nameProductSell);
                Document doc = productCollection.find(Filters.and(filter)).first();

                unitPrice = doc.getDouble("unit price");

                sale.setNameOfProduct(nameProductSell);
                sale.setAmountOfProductSold(quantity);
                sale.setTotalMoney(unitPrice);

                if (saleCollection.find(filter).first() == null) {
                    Document saleProduct = new Document("_id", new ObjectId())
                            /*.append("name of Product", sale.getNameOfProduct())
                            .append("amount sold", sale.getAmountOfProductSold())
                            .append("unit price", sale.getTotalMoney());*/
                            .append("name of Product", doc.get("name of Product"))
                            .append("amount sold", sale.getAmountOfProductSold())
                            .append("unit price", doc.getDouble("unit price"));

                    saleCollection.insertOne(saleProduct);
                    System.out.println("The sale has been registered");

                } else if (saleCollection.find(filter).first() != null) {

                    Bson updateAmount = Updates.inc("amount sold", +quantity);
                    saleCollection.updateOne(filter, updateAmount);
                    System.out.println("The sale has been registered");

                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    private static int updateOnlyOne(MongoCollection<Document> productCollection, int reply) throws NumberFormatException {
        String name;
        Boolean exit;
        int answer;
        name = answerOfUser(productCollection);
        Bson filter = Filters.eq("name of Product", name);
        printProdcutSelected(productCollection, filter);
        reply = updateOneProduct(reply, productCollection, filter);
        return reply;
    }

    private static int updateOneProduct(int reply, MongoCollection<Document> productCollection, Bson filter) throws NumberFormatException {
        int answer;
        Boolean exit;
        System.out.print("1)Modify name\n" + "2)Change unit price\n" + "3)Exit\n" + "Your answer:\t");
        answer = scanner.nextInt();

        validateUpdate(answer);

        if (answer == 1) {
            updateByName(productCollection, filter);
            exit = true;

        } else if (answer == 2) {
            updateUnitPrice(productCollection, filter);
            exit = true;

        }
        return reply;
    }

    private static void updateUnitPrice(MongoCollection<Document> productCollection, Bson filter) throws NumberFormatException {
        double unitPriceOfProductNew;
        System.out.println("_____________________________________");
        System.out.print("Enter the new unit price:\t");
        unitPriceOfProductNew = Double.parseDouble(scanner.next());

        Bson updateUnitPrice = Updates.set("unit price", unitPriceOfProductNew);
        productCollection.updateOne(filter, updateUnitPrice);
        System.out.println("Data has been updated");
    }

    private static void updateByName(MongoCollection<Document> productCollection, Bson filter) {
        String nameOfProductNew;
        System.out.println("_____________________________________");
        System.out.print("Enter the new name:\t");
        nameOfProductNew = scanner.next();

        Bson updateName = Updates.set("name of Product", nameOfProductNew);
        productCollection.updateOne(filter, updateName);
        System.out.println("Data has been updated");
    }

    private static void printProdcutSelected(MongoCollection<Document> productCollection, Bson filter) {
        try {
            Document doc = productCollection.find(Filters.and(filter)).first();
            System.out.println("product->" + doc.toJson());

        } catch (Exception e) {
            System.out.println("Data not found");
        }
    }

    private static String answerOfUser(MongoCollection<Document> productCollection) {
        String name;
        System.out.println("__________________________________________________________________");
        printAllProducts(productCollection);
        System.out.println("______________________________________________________________________");
        System.out.print("Enter the name of the product to update:\t");
        name = scanner.next();
        return name;
    }

    private static void updateAllProduct(MongoCollection<Document> productCollection, Product enteredProduct) throws NumberFormatException {
        String name;
        String nameNew;
        double unitPriceNew;
        System.out.println("____________________________________________________________________");
        printAllProducts(productCollection);
        System.out.println("______________________________________________________________________");
        scanner.nextLine();
        System.out.print("Enter the name of the product to update:\t");
        name = scanner.next();
        scanner.nextLine();
        Bson filter = Filters.eq("name of Product", name);
        System.out.println("________________________________________________________________");
        System.out.print("Enter the new product name:\t");
        nameNew = scanner.next();
        System.out.print("Enter the new unit price:\t");
        unitPriceNew = Double.parseDouble(scanner.next());
        enteredProduct.setName(nameNew);
        enteredProduct.setUnitPrice(unitPriceNew);
        Bson productUpdate = Updates.combine(
                Updates.set("name of Product", enteredProduct.getName()),
                Updates.set("unit price", enteredProduct.getUnitPrice()));
        productCollection.updateOne(filter, productUpdate);
        System.out.println("Data has been updated");
    }

    private static int validateUpdate(int reply) {
        while (reply < 1 || reply > 3) {
            System.out.print("Error you can only choose from 1 to 3\n Re-enter your answer:\t");
            reply = scanner.nextInt();
        }
        return reply;
    }

    private static int subMenuUpdate() {
        int reply;
        System.out.print("1)Update all the data of a product\n" + "2)Update only one data.\n" + "3)Exit\n" + "Enter your answer:\t");
        reply = scanner.nextInt();
        return reply;
    }

    private static Boolean printAllProducts(MongoCollection<Document> productCollection) {
        Boolean exit;
        System.out.println("________________________Registered products ________________________________________________");
        productCollection.find().forEach(doc -> System.out.println(doc.toJson()));
        exit = true;
        System.out.println("=======================================================================");
        return exit;
    }

    private static void oneProduct(MongoCollection<Document> productCollection, MongoDatabase database) throws NumberFormatException {
        int answer;
        answer = options();
        answer = validateAnswer(answer);
        if (answer == 1) {
            SearchByName(productCollection);
        } else if (answer == 2) {

            SearchByUnitPrice(database);

        } else {

        }
    }

    private static void SearchByUnitPrice(MongoDatabase database) throws NumberFormatException {
        System.out.print("Enter the unit price to be used as a basis:\t");
        double unitPrice = Double.parseDouble(scanner.next());
        Bson filter = Filters.and(Filters.gt("unit price", unitPrice));
        MongoCollection collection = database.getCollection("Product");

        MongoCursor<Document> cursor = collection.find(filter).iterator();

        System.out.println("---> " + collection.find(filter).iterator());
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
    }

    private static int validateAnswer(int answer) {
        while (answer < 1 && answer > 3) {
            System.out.println("Error try again");
            System.out.print("1)Search by name\n" + "2)Search by unit price\n" + "3)Exit\n" + "Enter your answer:\t");
            answer = scanner.nextInt();

        }
        return answer;
    }

    private static int options() {
        int answer;
        System.out.println("====================================================================");
        System.out.print("1)Search by name\n" + "2)Search by unit price\n" + "3)Exit\n" + "Enter your answer:\t");
        answer = scanner.nextInt();
        return answer;
    }

    private static int subMenu() {
        int option;
        System.out.println("============================================================================");
        System.out.print("1)Display only one product.\n" + "2)View all registered products.\n" + "Enter your answer:\t");
        option = scanner.nextInt();
        return option;
    }

}
