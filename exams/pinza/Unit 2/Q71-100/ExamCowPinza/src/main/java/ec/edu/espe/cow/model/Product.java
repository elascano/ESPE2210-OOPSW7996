/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cow.model;

import org.bson.Document;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public abstract class Product {

    private int id;
    private int age;
    private String Name;

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", age=" + age + ", Name=" + Name + '}';
    }

    public Product(int id, int age, String Name) {
        this.id = id;
        this.age = age;
        this.Name = Name;
    }


    public Product() {
        id = 0;
        age = 0;
        Name = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    

    public abstract Document createProduct();

    public abstract int readProduct();


}
