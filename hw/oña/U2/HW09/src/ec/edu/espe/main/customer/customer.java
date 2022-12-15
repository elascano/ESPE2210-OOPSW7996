
package ec.edu.espe.main.customer;

import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.main.exceptions.*;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */

public class customer {
    private int id;
    private String color;
    private int paws;
    
    private static Scanner sc = new Scanner(System.in);
    public static void enterTable(ArrayList<customer> customers)throws numberExceededException {
        customer Customer = new customer();
        enterData(Customer);
        if(Customer.getPaws()>4){
            throw new numberExceededException("The number exceeds the number of legs a table has");
        }
    }  
    public static void enterTableTwo(ArrayList<customer> customers)throws colorNameException {
        customer Customer = new customer();
        enterData2(Customer);
        if("sdsf".equals(Customer.getColor())){
            throw new colorNameException("Color does not exist");
        }
    }  

    public static void enterData(customer Customer) {
        //System.out.print("Enter ID:");
        //int id = sc.nextInt();
       // Customer.setId(id);
       // System.out.print("Enter color:");
       // String color = sc.next();
        //Customer.setColor(color);
        System.out.print("Enter paws:");
        int paws = sc.nextInt();
        Customer.setPaws(paws);
    }
    public static void enterData2(customer Customer) {
        //System.out.print("Enter ID:");
        //int id = sc.nextInt();
       // Customer.setId(id);
       System.out.print("Enter color:");
       String color = sc.next();
       Customer.setColor(color);
       // System.out.print("Enter paws:");
       // int paws = sc.nextInt();
       // Customer.setPaws(paws);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the paws
     */
    public int getPaws() {
        return paws;
    }

    /**
     * @param paws the paws to set
     */
    public void setPaws(int paws) {
        this.paws = paws;
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }

    /**
     * @param aSc the sc to set
     */
    public static void setSc(Scanner aSc) {
        sc = aSc;
    }
    
}
