/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.CruiseShips.model;

/**
 *
 * @author H303
 */
public class Cruise {
    private int id;
    private String dateOf;
    private Ship ship;

    
    
    public Cruise(int id, String dateOf, Ship ship) {
        this.id = id;
        this.dateOf = dateOf;
        this.ship = ship;
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
     * @return the dateOf
     */
    public String getDateOf() {
        return dateOf;
    }

    /**
     * @param dateOf the dateOf to set
     */
    public void setDateOf(String dateOf) {
        this.dateOf = dateOf;
    }

    /**
     * @return the ship
     */
    public Ship getShip() {
        return ship;
    }

    /**
     * @param ship the ship to set
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }
    
    
    
}
