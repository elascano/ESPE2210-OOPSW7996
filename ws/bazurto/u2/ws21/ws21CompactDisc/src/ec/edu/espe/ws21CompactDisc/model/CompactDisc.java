/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws21CompactDisc.model;

import java.util.ArrayList;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class CompactDisc {
    private int id;
    private String typeOfCompactDisc;
    private float memoryOfCompactDisc ;

    public CompactDisc() {
        this.id = 0;
        this.typeOfCompactDisc = "";
        this.memoryOfCompactDisc = 0;
    }

    public CompactDisc(int id, String typeOfCompactDisc, float memoryOfCompactDisc) {
        this.id = id;
        this.typeOfCompactDisc = typeOfCompactDisc;
        this.memoryOfCompactDisc = memoryOfCompactDisc;
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
     * @return the typeOfCompactDisc
     */
    public String getTypeOfCompactDisc() {
        return typeOfCompactDisc;
    }

    /**
     * @param typeOfCompactDisc the typeOfCompactDisc to set
     */
    public void setTypeOfCompactDisc(String typeOfCompactDisc) {
        this.typeOfCompactDisc = typeOfCompactDisc;
    }

    /**
     * @return the memoryOfCompactDisc
     */
    public float getMemoryOfCompactDisc() {
        return memoryOfCompactDisc;
    }

    /**
     * @param memoryOfCompactDisc the memoryOfCompactDisc to set
     */
    public void setMemoryOfCompactDisc(float memoryOfCompactDisc) {
        this.memoryOfCompactDisc = memoryOfCompactDisc;
    }

    @Override
    public String toString() {
        return "CompactDisc{" + "id=" + id + ", typeOfCompactDisc=" + typeOfCompactDisc + ", memoryOfCompactDisc=" + memoryOfCompactDisc + '}';
    }


  
    
}
