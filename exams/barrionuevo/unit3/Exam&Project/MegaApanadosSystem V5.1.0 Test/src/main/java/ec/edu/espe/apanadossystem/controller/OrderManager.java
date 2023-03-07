/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadossystem.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.apanadossystem.model.Food;
import ec.edu.espe.apanadossystem.model.Menu;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class OrderManager {
    
    public static void initialiceTableAndCombo(JTable tblMenu,JComboBox<String> comboMenu) {
        DefaultTableModel tblModel;
        String[] header = {"Product","Price"};
        tblModel = new DefaultTableModel (header,0);
        tblMenu.setModel(tblModel);
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
 
                MongoCollection<Document> collection = database.getCollection("Food");
                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
                
                int foodId;
                String foodName;
                double foodPrice;
                
                int id = 1;
                do {
                    Menu menu;
                    Document newFood = new Document("id", id);
                    filter = Filters.and(Filters.in("id", id));
                    newFood = collection.find(filter).first();
                    
                    foodId=newFood.getInteger("id");
                    foodName=newFood.getString("name");
                    foodPrice=newFood.getDouble("price");
                    menu = new Menu(foodId,foodName,foodPrice);
                    tblModel.addRow(menu.toArray());
                    id+=1;
                    
                    comboMenu.addItem(menu.getName());
                    
                } while (id<collection.countDocuments());
            } catch (MongoException me) {
            }
            
        }
        
        

    }
    
    
    public static void initialiceSpinner(JSpinner spiAmount) {
        SpinnerNumberModel number = new SpinnerNumberModel();
        number.setMaximum(10);
        number.setMinimum(0);
        spiAmount.setModel(number);
    }
    
    public static ArrayList<Food> Add(JSpinner spiAmount,JComboBox<String> comboMenu,ArrayList<Food> foodOrdered){
        int amount;
        String foodName;
        Food food;
        double unityPrice = 0;
        double totalPrice=0;
        amount = (int) spiAmount.getValue();
        foodName=(String) comboMenu.getSelectedItem();
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                MongoCollection<Document> collection = database.getCollection("Food");
                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();



                Document newFood = new Document("id", foodName);
                filter = Filters.and(Filters.in("name", foodName));
                newFood = collection.find(filter).first();
                unityPrice = newFood.getDouble("price");
                totalPrice = unityPrice*amount;

            } catch (MongoException me) {
            }
            
        }
        
        
        
        food = new Food(foodName,amount,unityPrice,totalPrice);
        foodOrdered.add(food);
        spiAmount.setValue(0);
        
        return foodOrdered;
    }
    
    
    public static void initialiceTable(JTable tblOrder,ArrayList<Food> foodOrdered,JLabel txtTotal) {
        DefaultTableModel tblModel;
        String[] header = {"Product","Amount","Unity Price","Total Price"};
        tblModel = new DefaultTableModel (header,0);
        tblOrder.setModel(tblModel);
        double totalValue = 0;
        for(int i=0;i<foodOrdered.size();i++){
            Food food;
            food = foodOrdered.get(i);
            
            tblModel.addRow(food.toArray());
            totalValue = totalValue+foodOrdered.get(i).getTotalPrice();
            
        }

        txtTotal.setText(Double.toString(totalValue));
    }
    
    public static void enterLetters(KeyEvent evt) {                                 

        int key = evt.getKeyChar();

        boolean capitalLetters = key >= 65 && key <= 90;
        boolean lowercase = key >= 97 && key <= 122;
        boolean spaceBar = key == 32;

        if (!(lowercase || capitalLetters || spaceBar)) {
            evt.consume();
        }
    }  
    
    
    
    public static void enterNumbers(KeyEvent evt,JTextField txt) {                                      
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }

        if (txt.getText().trim().length() == 10) {
            evt.consume();
        }
    }
    
    
    public static boolean validateID(String id) {
        int plus = 0;
        if (id.length() == 9) {
            return false;
        } else {
            int pair[] = new int[id.length() / 2];
            int odd[] = new int[(id.length() / 2)];
            int sumPairs = 0;
            int oddsum = 1;
            for (int i = 0; i < id.length() / 2; i++) {
                pair[i] = Integer.parseInt(String.valueOf(id.charAt(sumPairs)));
                sumPairs = sumPairs + 2;
                if (i < (id.length() / 2) - 1) {
                    odd[i] = Integer.parseInt(String.valueOf(id.charAt(oddsum)));
                    oddsum = oddsum + 2;
                }
            }

            for (int i = 0; i < pair.length; i++) {
                pair[i] = pair[i] * 2;
                if (pair[i] > 9) {
                    pair[i] = pair[i] - 9;
                }
                plus = plus + pair[i] + odd[i];
            }
            int assistant = plus / 10;
            int tenthNumber = (assistant + 1) * 10;
            if ((tenthNumber - plus) == Integer.parseInt(String.valueOf(id.charAt(id.length() - 1)))) {
                return true;
            } else if (plus % 10 == 0 && id.charAt(id.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }

        }
    }
    
    
    public static boolean validateEmail(String email){
 
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void enterCardNumbers(KeyEvent evt,JTextField txt) {                                      
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }

        if (txt.getText().trim().length() == 12) {
            evt.consume();
        }
    }
    
    public static void enterCVCNumbers(KeyEvent evt,JTextField txt) {                                      
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }

        if (txt.getText().trim().length() == 3) {
            evt.consume();
        }
    }
    
    
    public static void enterExpidedDate(KeyEvent evt,JTextField txtExpiredDate) {                                        
        int key = evt.getKeyChar();

        boolean numbers = key >= 48 && key <= 57;

        if (!numbers) {
            evt.consume();
        }
        
        if (txtExpiredDate.getText().trim().length() == 2) {
            txtExpiredDate.setText(txtExpiredDate.getText()+"/");
        }
        if (txtExpiredDate.getText().trim().length() == 5) {
            txtExpiredDate.setText(txtExpiredDate.getText()+"/");
        }

        if (txtExpiredDate.getText().trim().length() == 8) {
            evt.consume();
        }
    }  
    
    public static boolean validateDate(String date){
 
        Pattern pattern = Pattern.compile("^[_0-9-\\+]+(\\.[_0-9-]+)*/"+ "[0-9-]+(\\.[0-9]+)*(\\/[0-9]{2,})$");

        Matcher mather = pattern.matcher(date);
 
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
    
}
