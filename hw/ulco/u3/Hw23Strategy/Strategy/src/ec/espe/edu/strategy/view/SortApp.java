package ec.espe.edu.strategy.view;
/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
import ec.espe.edu.strategy.model.SortingContext;
import java.util.Arrays;
import java.util.Random;

public class SortApp {
    public static void main(String args[ ]) {
        Random rand = new Random();
        SortingContext sc = new SortingContext();
        
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
         System.out.println("Disordered -->"+Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered -->:"+Arrays.toString(data));
        
        data = new int[30];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
         System.out.println("Disordered -->"+Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered -->:"+Arrays.toString(data));
        
        data = new int[110];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }
        System.out.println("");
       System.out.println("Disordered -->"+Arrays.toString(data));
        sc.sort(data);
        System.out.println("Ordered -->:"+Arrays.toString(data));
    }
}
