/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mongodb;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class NewClass 
{
     public DB db;
    public DBCollection table;
    public DBCursor cursor = null;
    public BasicDBObjectBuilder document = new BasicDBObjectBuilder();
    public void DataBase()
    {
        try 
        {
            Mongo mongo = new Mongo("localhost", 27017);
           db=mongo.getDB("OOP");
           table=db.getCollection("Product");
            
        } catch (Exception e) 
        {
            System.out.println("No se puedo conectae");
        }
        
    }
    public static void main(String[] args) {
        
    }
 }
    
    

