/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correctionForExam.model;

/**
 *
 * @author Karla Ansatuña
 */
public class FlashDriver {
    private String color;
    private int id;
    private int quantity;
    
public FlashDriver(){
    color="";
    id=0;
    quantity=0;
}
    public FlashDriver(String color, int id, int quantity) {
        this.color = color;
        this.id = id;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
