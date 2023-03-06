/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.factorypattern.model;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        System.out.println("Please enter you Operative System");
        System.out.println("0. Windows");
        System.out.println("1. Linux");
        Scanner scan = new Scanner(System.in);

        int systemNumber = scan.nextInt();
        
        if (systemNumber == 0) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }

    public abstract Button createButton();
    public abstract Menu createMenu();

}
