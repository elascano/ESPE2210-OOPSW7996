
package ec.edu.espe.calculator.view;

import unittest.*;
import ec.edu.espe.calculator.controller.BasicOperation;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class UnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BasicOperation basicOperation = new BasicOperation();
       float addend1=12.33F;
       float addend2=54.84F;
       float sum=0;
       
       sum = basicOperation.add(addend1, addend2);
       System.out.println("sum -->     "+sum);
    }
    
}
