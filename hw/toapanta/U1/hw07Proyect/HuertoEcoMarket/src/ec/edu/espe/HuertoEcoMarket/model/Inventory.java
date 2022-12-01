/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.HuertoEcoMarket.model;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

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
    public ArrayList<RegisterProduct> listProduct = new ArrayList<>();


    RegisterProduct registerEntered = new RegisterProduct();

    public ArrayList<RegisterProduct> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<RegisterProduct> listProduct) {
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

    
    
    public void Add(){

    Scanner entered = new Scanner(System.in);    
    
        String valor;
        RegisterProduct product = new RegisterProduct();
        System.out.println("introduced or added \t--> " + product.getName());
        System.out.println("product packagest \t--> " + product.getAmount());
        System.out.println("full value is $ \t--> " + product.getUnitPrice());
        listProduct.add(product);
    
    }
    
    
    
    
    
    public void Remove(){

    try{
    Scanner entered = new Scanner(System.in);    
    
    String valor;
    int amountToRemove;
    
    int indice;
        System.out.println("What Product do you want to remove?");
        System.out.print("Product Name: ---> ");
        valor = entered.nextLine();
        indice = listProduct.indexOf(valor);
        System.out.println("How many units do you want to remove?");
        System.out.print("ProductUnits: ---> ");
        amountToRemove= entered.nextInt();
        
        if(indice !=-1){
        listProduct.remove(indice);
            System.out.println("Has been removed " + amountToRemove + " boxes of " +valor+ " the inventory");
            
         
        }else{
            System.out.println("Product Not Found");
        }

    }catch(java.lang.RuntimeException error){
        System.err.println("ERROR, wrong data type");
    }
    
    
    
    }
     
}
