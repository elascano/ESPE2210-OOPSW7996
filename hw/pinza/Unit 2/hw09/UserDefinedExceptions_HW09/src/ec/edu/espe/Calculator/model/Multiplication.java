/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Calculator.model;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Multiplication {

    private int multiplicand;
    private int multiplier;
    private int product;

    Scanner scan = new Scanner(System.in);

    public int getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(int multiplicand) {
        this.multiplicand = multiplicand;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }
    
        public void newMultiplication() {
        Multiplication multiplication = new Multiplication();
        System.out.println("Please, enter the multiplicand: ");
        multiplication.setMultiplicand(scan.nextInt());
        System.out.println("Please, enter the multiplier: ");
        multiplication.setMultiplier(scan.nextInt());

        multiplication.setProduct(multiplication.getMultiplicand()*multiplication.getMultiplier());
        System.out.println("The result of the multiplication is: " + multiplication.getProduct());

    }
        

}
