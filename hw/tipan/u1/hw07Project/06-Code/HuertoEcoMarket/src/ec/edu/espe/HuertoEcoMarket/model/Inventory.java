/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.HuertoEcoMarket.model;

import java.util.ArrayList;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Inventory {

    private String name;
    private int amount;
    private double unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Inventory{" + "name=" + name + ", amount=" + amount + ", unitPrice=" + unitPrice + '}';
    }

    public Inventory() {
        this.name = "";
        this.amount = 0;
        this.unitPrice = 0.0;

    }

    private RegisterProduct listProduct = new RegisterProduct();

    RegisterProduct registerEntered = new RegisterProduct();

    public RegisterProduct getListProduct() {
        return listProduct;
    }

    public void setListProduct(RegisterProduct listProduct) {
        this.listProduct = listProduct;
    }

    public RegisterProduct getRegisterEntered() {
        return registerEntered;
    }

    public void setRegisterEntered() {
        this.registerEntered = null;
    }

    public void setRegisterEntered(RegisterProduct registerEntered) {
        this.registerEntered = registerEntered;
    }
    public String[] getArray(){
        String [] data={name,String.valueOf(amount),String.valueOf(unitPrice)};
        return data;
    }


}
