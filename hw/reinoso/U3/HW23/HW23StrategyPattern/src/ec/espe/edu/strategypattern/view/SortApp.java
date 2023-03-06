package ec.espe.edu.strategypattern.view;

import ec.espe.edu.strategypattern.model.SortingContext;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class SortApp {
    public static void main(String args[ ]) {
        Random rand = new Random();
        SortingContext sc = new SortingContext();
        
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("Unordered random array: "+Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered random array:   "+Arrays.toString(data));
        
        data = new int[30];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
        System.out.println("Unordered random array: "+Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered random array:   "+Arrays.toString(data));
        
        data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
        System.out.println("Unordered random array: "+Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered random array:   "+Arrays.toString(data));
    }
}
