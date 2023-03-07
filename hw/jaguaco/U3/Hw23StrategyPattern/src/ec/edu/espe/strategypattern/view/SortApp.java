
package ec.edu.espe.strategypattern.view;

import ec.edu.espe.strategypattern.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class SortApp {

    public static void main(String args[]) {
        SortingContext sortingContext;
        int data[];
        
        sortingContext = new SortingContext();                
        data = new int[11];
                        
        for (int i = 0; i < 11; i++) {
            data[i] = (int)(Math.random()*100+1);
        }        
        
        System.out.println("1. unordered data\n" + Arrays.toString(data));        
        sortingContext.sort(data);        
        System.out.println("1. ordered data\n" + Arrays.toString(data));
        
        data = new int[30];
                        
        for (int i = 0; i < 30; i++) {
            data[i] = (int)(Math.random()*100+1);
        }        
        
        System.out.println("\n2. unordered data\n" + Arrays.toString(data));        
        sortingContext.sort(data);        
        System.out.println("2. ordered data\n" + Arrays.toString(data));
        
        data = new int[100];
                        
        for (int i = 0; i < 100; i++) {
            data[i] = (int)(Math.random()*100+1);
        }        
        
        System.out.println("\n3. unordered data\n" + Arrays.toString(data));        
        sortingContext.sort(data);        
        System.out.println("3. ordered data\n" + Arrays.toString(data));

    }
}
