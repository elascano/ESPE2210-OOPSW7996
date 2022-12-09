/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.city.view;

import ec.edu.espe.city.model.City;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class DisplayCity {

    public static void main(String[] args) {

        ArrayList<City> city;
        int sizeCity;
        int option;
        city = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
               

        for (int i = 0; i < 5; i++) {
            city.add(i, new City("1", "3424", "Quito", "1845"));
        }
        sizeCity = city.size();
        for (City printf : city) {
            System.out.println(printf);
        }
        System.out.println("Juan Pablo Pinza Exam");
        System.out.println("City Data: " + sizeCity);       
        
    }

}
