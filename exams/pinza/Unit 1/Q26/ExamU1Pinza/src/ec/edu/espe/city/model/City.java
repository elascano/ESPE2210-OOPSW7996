/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.city.model;

import java.util.ArrayList;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class City {
    private String id;
    private String population;
    private String name;
    private String yearOfFoundation;

    public City(String id, String population, String name, String yearOfFoundation) {
        this.id = id;
        this.population = population;
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", population=" + population + ", name=" + name + ", yearOfFoundation=" + yearOfFoundation + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(String yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    
    
    
    
 
}
