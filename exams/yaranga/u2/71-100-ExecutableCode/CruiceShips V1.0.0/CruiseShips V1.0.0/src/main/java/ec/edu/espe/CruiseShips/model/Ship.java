/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.CruiseShips.model;

/**
 *
 * @author H303
 */
public class Ship {
    private int id;
    private String model;
    private long capacity;
public Ship() {
        this.id = 0;
        this.model = "";
        this.capacity = 0;
    }
    
    public Ship(int id, String model, long capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the capacity
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    
  
}
