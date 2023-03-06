package ec.edu.espe.taxes.controller;
¿
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonTestCases {
    public static void main(String[] args) {
        // Crea un objeto JSON
        JSONObject testCase1 = new JSONObject();
        testCase1.put("nombre", "Prueba 1");
        testCase1.put("resultado", "exitosa");

        JSONObject testCase2 = new JSONObject();
        testCase2.put("nombre", "Prueba 2");
        testCase2.put("resultado", "fallida");

        // Agrega los objetos JSON a un arreglo
        JSONArray testCases = new JSONArray();
        testCases.add(testCase1);
        testCases.add(testCase2);

        // Escribe el arreglo en un archivo JSON
        try (FileWriter file = new FileWriter("testCases.json")) {
            file.write(testCases.toJSONString());
            System.out.println("Casos de prueba guardados en testCases.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
