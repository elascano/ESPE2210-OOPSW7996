/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.sortingProgram.controller;

import com.mongodb.client.MongoCollection;
import static ec.edu.espe.sortingProgram.controller.MongoConnection.getConnection;
import org.bson.Document;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class SortController {
    public static void addSortCase(Document sortCase) {
        MongoCollection activitiesCollection = getConnection("Cristian");
        activitiesCollection.insertOne(sortCase);
    }
}
