package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.model.SortingContext;
import java.util.Random;
import java.util.Arrays;


/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class SortApp1 {
    public static void main(String[] args) {
        Random random = new Random();
        SortingContext sc = new SortingContext();
        
        int[] data = new int[8];
        for(int i=0; i<data.length;i++){
            data[i] = random.nextInt(50);
        }
        
        System.out.println("Unordered randow array: " + Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered random array: "+Arrays.toString(data));
        
        data = new int [30];
        for(int i=0; i<data.length;i++){
            data[i] = random.nextInt(50);
           
        }
        System.out.println("Unordered randow array: " + Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered random array: "+Arrays.toString(data));
        
    }
}
