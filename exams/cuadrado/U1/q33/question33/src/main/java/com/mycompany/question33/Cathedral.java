/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question33;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
class Cathedral {
    public class Cathedral{
    private Date date;
    private String id;
    private String name;

    public cathedral{
        date = null;
        id = "";
        name = "";
    }
    public Cathedral(Date date, String id, String name) {
        this.date = date;
        this.id = id;
        this.name = name;
    }
    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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

    public void Cathedral() {
        date = new Date();
        //Using data from Keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Cathedral id: ");
        id= scan.nextLine();
        System.out.print("Name Cathedral: ");
        name = scan.nextLine();
        System.out.println(date);
        printCathedral();
    }

        private void printCathedral() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
