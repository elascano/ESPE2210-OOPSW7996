/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        
        BasicOperation basicOperation = new BasicOperation();
        Scanner console = new Scanner(System.in);
        
        
        float addend1 = 12.33F;
        float addend2 = 54.8F;
        float sum = 0;
        
        sum = basicOperation.add(addend1, addend2);
        System.out.println("sum -->" + sum);
    }
}
