/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.model;

import org.bson.Document;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public abstract class Product {

    private int id;
    private String name;
    private int amount;
    private float price;
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quantity
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the quantity to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the pricePerUnit
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the pricePerUnit to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }
    
    public Product(){
        id = 0;
        name = "";
        amount = 0;
        price = 0;
    }

    public Product(int id, String name, int amount, float price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    
    
    
    public abstract Document createProduct();
    
    public abstract int readProduct();
   
    public abstract Product updateProduct();
    
    public abstract int deleteProduct();
    
    
    
}
