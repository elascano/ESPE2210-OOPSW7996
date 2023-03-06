package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class SortApp {
    public static void main(String[] args) {
        SortingContext sortingContext;
        int data[];
        
        sortingContext = new SortingContext();
        data = new int[25];
        
        for (int i = 0; i < 25; i++){
            data[i] = (int)(Math.random()*100+1);
        }
        
        System.out.println("------------------------------");
        System.out.println("       Messed up Data       ");
        System.out.println(Arrays.toString(data));
        sortingContext.sort(data);
        System.out.println(Arrays.toString(data));
        
        data = new int[75];
        
        for (int i = 0; i < 75; i++){
            data[i] = (int)(Math.random()*100+1);
        }
        
        System.out.println("------------------------------");
        System.out.println("       Messed up Data       ");
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(data));
        sortingContext.sort(data);
        System.out.println(Arrays.toString(data));
        
        data = new int[125];
        
        for (int i = 0; i < 125; i++){
            data[i] = (int)(Math.random()*100+1);
        }
        
        System.out.println("------------------------------");
        System.out.println("       Messed up Data       ");
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(data));
        sortingContext.sort(data);
        System.out.println(Arrays.toString(data)); 
    }
}
