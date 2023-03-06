
package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
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
        
        System.out.println("1. Unordered data: " + Arrays.toString(data));        
        sortingContext.sort(data);        
        System.out.println("1. Ordered data: " + Arrays.toString(data));
        
        data = new int[30];
                        
        for (int i = 0; i < 30; i++) {
            data[i] = (int)(Math.random()*100+1);
        }        
        
        System.out.println("2. Unordered data: " + Arrays.toString(data));        
        sortingContext.sort(data);        
        System.out.println("2. Ordered data: " + Arrays.toString(data));
        
        data = new int[100];
                        
        for (int i = 0; i < 100; i++) {
            data[i] = (int)(Math.random()*100+1);
        }        
        
        System.out.println("3. Unordered data: " + Arrays.toString(data));        
        sortingContext.sort(data);        
        System.out.println("3. Ordered data: " + Arrays.toString(data));

    }
}
