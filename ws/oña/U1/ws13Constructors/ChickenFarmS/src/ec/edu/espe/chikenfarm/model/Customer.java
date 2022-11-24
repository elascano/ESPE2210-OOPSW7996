/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chikenfarm.model;

import ec.edu.espe.chickenfarm.view.Chicken;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Customer {
    public static void main(String[] args) {
        int b;
        b=20;
        System.out.println("b (before)---->"+b);
        Chicken.modify(b);
        System.out.println("b--->"+b);
        
        Chicken customer = new Chicken(0, "Martin", "Blue", 19, true);
        
        System.out.println("Customer (Before)--->"+customer);
        Chicken.modifyObject(customer);
        System.out.println("customer (affter)-->"+customer);
        
        
    }
    
}
