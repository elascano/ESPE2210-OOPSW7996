/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Product {

    private String name;
    private int amount;
    private double price;

    public Product(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Product() {
        name = "";
        amount = 0;
        price = 0;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", amount=" + amount + ", price=" + price + '}';
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
     * @return the nrc
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the nrc to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the studentNumber
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the studentNumber to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    public static Product toProduct(Object[] productList) {
        Product product;

        if (productList == null) {
            return null;
        }

        product = new Product((String) productList[1], (Integer) productList[2], (Float) productList[3]);

        return product;
    }

    public static ArrayList read(ArrayList<Object> productsList) {
        ArrayList<Product> products;
        Object[] productList;

        products = new ArrayList<>();

        for (int i = 0; i < productsList.size(); i++) {
            productList = (Object[]) productsList.get(i);
            products.add(toProduct(productList));
        }

        return products;
    }

}
