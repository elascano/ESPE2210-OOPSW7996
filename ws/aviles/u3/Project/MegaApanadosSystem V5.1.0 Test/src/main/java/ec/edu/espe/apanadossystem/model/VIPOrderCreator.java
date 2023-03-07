/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadossystem.model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class VIPOrderCreator extends OrderCreator {
    public VIPOrderCreator(Customer customer, List<Menu> menuItems) {
        super(customer, menuItems);
    }

    @Override
    protected double calculateTotalPrice() {
        double totalPrice = 0;
        for (Menu item : menuItems) {
            totalPrice += item.getPrice() * 0.9; 
        }
        return totalPrice;
    }
}