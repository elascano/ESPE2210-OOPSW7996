/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.keyboardStore.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Keyboard {
    private int id;
    private String name;
    private String mechanicOrMembrane;
    private float price;

    public Keyboard(int id, String name, String mechanicOrMembrane, float price) {
        this.id = id;
        this.name = name;
        this.mechanicOrMembrane = mechanicOrMembrane;
        this.price = price;
    }

    public Keyboard() {
        this.id = 0;
        this.name = "";
        this.mechanicOrMembrane = "";
        this.price = 0;
    }
    
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
     * @return the mechanicOrMembrane
     */
    public String getMechanicOrMembrane() {
        return mechanicOrMembrane;
    }

    /**
     * @param mechanicOrMembrane the mechanicOrMembrane to set
     */
    public void setMechanicOrMembrane(String mechanicOrMembrane) {
        this.mechanicOrMembrane = mechanicOrMembrane;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
