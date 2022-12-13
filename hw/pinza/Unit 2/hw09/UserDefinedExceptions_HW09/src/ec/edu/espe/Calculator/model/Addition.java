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
public class Addition {

    private int firstAddend;
    private int secondAddend;
    private int addendResult;

    Scanner scan = new Scanner(System.in);

    public int getFirstAddend() {
        return firstAddend;
    }

    public void setFirstAddend(int firstAddend) {
        this.firstAddend = firstAddend;
    }

    public int getSecondAddend() {
        return secondAddend;
    }

    public void setSecondAddend(int secondAddend) {
        this.secondAddend = secondAddend;
    }

    public int getAddendResult() {
        return addendResult;
    }

    public void setAddendResult(int addendResult) {
        this.addendResult = addendResult;
    }

    public void newAddition() {
        Addition addition = new Addition();
        System.out.println("Please, enter the first addend: ");
        addition.setFirstAddend(scan.nextInt());
        System.out.println("Please, enter the second addend: ");
        addition.setSecondAddend(scan.nextInt());

        addition.setAddendResult(addition.getFirstAddend()+addition.getSecondAddend());
        System.out.println("The result of the addition is: " + addition.getAddendResult());

    }

}
