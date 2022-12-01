/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.HuertoEcoMarket.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Sales {
    private double unitPrice;
    private String name;
    private double fullValue;

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFullValue() {
        return fullValue;
    }

    public void setFullValue(double fullValue) {
        this.fullValue = fullValue;
    }   

    public Sales(double unitPrice, String name, double fullValue) {
        this.unitPrice = unitPrice;
        this.name = name;
        this.fullValue = fullValue;
    }
    public Sales() {
        this.unitPrice =0.0;
        this.name ="";
        this.fullValue =0.0;
    } 
    public void totalAmount(){
        double result=unitPrice+fullValue;
        System.out.println("The total purchase price is:"+ result);
       
    }
}


