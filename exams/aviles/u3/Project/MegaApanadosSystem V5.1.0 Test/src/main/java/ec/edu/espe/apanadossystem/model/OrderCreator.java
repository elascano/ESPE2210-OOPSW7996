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
public abstract class OrderCreator {
    protected Customer customer;
    protected List<Menu> menuItems;

    public OrderCreator(Customer customer, List<Menu> menuItems) {
        this.customer = customer;
        this.menuItems = menuItems;
    }

    public Order createOrder() {
  
        Order order = new Order(0,  customer.getName(),  customer.getEmail(),customer.getID(), calculateTotalPrice(),false);
        return order;
    }

    protected abstract double calculateTotalPrice();
}