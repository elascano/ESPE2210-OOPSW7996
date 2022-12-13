/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Calculator.model;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Substraction {
        private int minuend;
    private int substrahend;
    private int substractionResult;

    Scanner scan = new Scanner(System.in);

    public int getMinuend() {
        return minuend;
    }

    public void setMinuend(int minuend) {
        this.minuend = minuend;
    }

    public int getSubstrahend() {
        return substrahend;
    }

    public void setSubstrahend(int substrahend) {
        this.substrahend = substrahend;
    }

    public int getSubstractionResult() {
        return substractionResult;
    }

    public void setSubstractionResult(int substractionResult) {
        this.substractionResult = substractionResult;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
        public void newSubstraction() {
        Substraction substraction = new Substraction();
        System.out.println("Please, enter Minuend: ");
        substraction.setMinuend(scan.nextInt());
        System.out.println("Please, enter the Substrahend: ");
        substraction.setSubstrahend(scan.nextInt());

        substraction.setSubstractionResult(substraction.getMinuend()-substraction.getSubstrahend());
        System.out.println("The result of the substraction is: " + substraction.getSubstractionResult());

    }
    
}
