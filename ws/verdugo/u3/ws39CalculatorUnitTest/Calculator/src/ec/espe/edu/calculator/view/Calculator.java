
package ec.espe.edu.calculator.view;

import ec.espe.edu.calculator.controller.BasicOperation;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BasicOperation basicOperation = new BasicOperation();
        float addend1 = 12.3F;
        float addend2 = 54.8F;
        float sum = 0;
        
        sum = basicOperation.add(addend1, addend2);
        System.out.println("sum ==>" + sum);
    }
    
}
