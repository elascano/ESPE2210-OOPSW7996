
package ec.edu.espe.calculator.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.calculator.model.Add;
import ec.edu.espe.calculator.model.Divide;
import ec.edu.espe.calculator.model.Multiply;
import ec.edu.espe.calculator.model.Subtract;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class JsonManager {
    
    public static ArrayList<Subtract> subtractRead(ArrayList<Subtract> subtract) throws JsonSyntaxException {
        Gson gson = new Gson();
        String fromJson = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Subtract.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Subtract>> type = new TypeToken<ArrayList<Subtract>>() {
                };
                subtract = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (IOException ex) {
        }
        return subtract;
    }
    
    public static ArrayList<Add> addRead(ArrayList<Add> add) {
        Gson gson = new Gson();
        String fromJson = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Add.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Add>> type = new TypeToken<ArrayList<Add>>() {
                };
                add = gson.fromJson(fromJson, type.getType());
            }
            br.close();

        } catch (Exception e) {
        }
        return add;
    }
    
    public static ArrayList<Multiply> multiplyRead(ArrayList<Multiply> multiply) throws JsonSyntaxException {
        Gson gson = new Gson();
        String fromJson = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Multiply.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Multiply>> type = new TypeToken<ArrayList<Multiply>>() {
                };
                multiply = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (IOException ex) {
        }
        return multiply;
    }
    
    public static ArrayList<Divide> divideRead(ArrayList<Divide> divide) throws JsonSyntaxException {
        Gson gson = new Gson();
        String fromJson = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Divide.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Divide>> type = new TypeToken<ArrayList<Divide>>() {
                };
                divide = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (IOException ex) {
        }
        return divide;
    }
}
