/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirportTaxiScheduling.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TravelerPayments {

    private String name;
    private String adress;
    private float payment;

    public TravelerPayments() {
        this.name = "";
        this.adress = "";
        this.payment = 0;
    }

    public TravelerPayments(String name, String adress, float payment) {
        this.name = name;
        this.adress = adress;
        this.payment = payment;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the payment
     */
    public float getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(float payment) {
        this.payment = payment;
    }

    public static void registerFilePayment(TravelerPayments payments) {
        DateFormat dateFormat = new SimpleDateFormat(" d MMM yyyy, HH:mm:ss z");
        String dateActual = dateFormat.format(new Date());
        File List = new File("payments.csv");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(List, true));
            writer.println("NAME" + ";" + "ADRESS" + ";" + "PAYMENT" + ";" + "DATE");
            writer.println(payments.getName() + ";" + payments.getAdress() + ";" + payments.getPayment() + ";" + dateActual);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
