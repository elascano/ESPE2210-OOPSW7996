/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.factorypattern.view;

import ec.edu.espe.factorypattern.model.Button;
import ec.edu.espe.factorypattern.model.GUIFactory;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory mainFactory = GUIFactory.getFactory();
        Button mainButton = mainFactory.createButton();
        mainButton.caption = "being used :)";
        mainButton.paint();
    }
    
}
