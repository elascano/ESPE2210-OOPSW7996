/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Customer {
    private String name;
    private String Email;
    private int ID;
    private String addres;
    private int phone;

    public Customer(String name, String Email, int ID, String addres, int phone) {
        this.name = name;
        this.Email = Email;
        this.ID = ID;
        this.addres = addres;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    

    


    

    
}
