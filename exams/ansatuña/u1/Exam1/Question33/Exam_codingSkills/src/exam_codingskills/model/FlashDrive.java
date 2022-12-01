/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_codingskills.model;

/**
 *
 * @author NW USER
 */
public class FlashDrive {

    public FlashDrive() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "FlashDrive{" + "id=" + id + ", color=" + color + ", quantity=" + quantity + '}';
    }

    public FlashDrive(int id, String color, int quantity) {
        this.id = id;
        this.color = color;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   private int id;
   private String color;
   private int quantity; 
}
