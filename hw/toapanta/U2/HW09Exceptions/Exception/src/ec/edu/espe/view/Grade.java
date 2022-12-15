/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.model.AgeException;
import java.util.Scanner;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Grade {

    public static void main(String[] args) throws AgeException {
        int age;
        final int MAXIMUM_AGE = 100;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the age:");
        age = Integer.parseInt(console.nextLine());

        try {
            if (age < MAXIMUM_AGE) {
                System.out.println("You're too young, don't kill yourself.");
            } else {
                throw new AgeException("it's time to go baquero");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
