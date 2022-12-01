/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.newpackage.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Store {
    private int id;
    private String localName;
    private String ownerName;
    private String phoneNumberOwner;

    public Store(int id, String localName, String ownerName, String phoneNumberOwner) {
        this.id = id;
        this.localName = localName;
        this.ownerName = ownerName;
        this.phoneNumberOwner = phoneNumberOwner;
    }
    
    public Store() {
        this.id = 0;
        this.localName = "";
        this.ownerName = "";
        this.phoneNumberOwner = "";
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
     * @return the localName
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * @param localName the localName to set
     */
    public void setLocalName(String localName) {
        this.localName = localName;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return the phoneNumberOwner
     */
    public String getPhoneNumberOwner() {
        return phoneNumberOwner;
    }

    /**
     * @param phoneNumberOwner the phoneNumberOwner to set
     */
    
    
    
}    
    

