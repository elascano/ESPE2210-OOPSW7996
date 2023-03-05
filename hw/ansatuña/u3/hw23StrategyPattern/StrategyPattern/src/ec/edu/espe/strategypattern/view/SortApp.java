package ec.edu.espe.strategypattern.view;

import ec.edu.espe.strategypattern.model.SortingContext;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Random rand = new Random();
        SortingContext sc = new SortingContext();
        
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
        System.out.println("Unorganized array: ");
        System.out.println(Arrays.toString(data));
        sc.sort(data);
        System.out.println("");
        System.out.println("Organized array: ");
        System.out.println(Arrays.toString(data));
        data = new int[30];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
        System.out.println("Unorganized array: ");
        System.out.println(Arrays.toString(data));
        sc.sort(data);
        System.out.println("");
        System.out.println("Organized array: ");
        System.out.println(Arrays.toString(data));
        data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
        System.out.println("Unorganized array: ");
        System.out.println(Arrays.toString(data));
        sc.sort(data);
        System.out.println("");
        System.out.println("Organized array: ");
        System.out.println(Arrays.toString(data));
    }
    
}
