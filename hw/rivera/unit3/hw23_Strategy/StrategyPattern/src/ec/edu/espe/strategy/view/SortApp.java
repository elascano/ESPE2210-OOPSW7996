package ec.edu.espe.strategy.view;

import ec.edu.espe.strategy.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Joel Rivera, WebMasterTeam, DCCO-ESPE
 */
public class SortApp {

    public static void main(String args[]) {
        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3, 6, 4, 6, 7, 8, 5, 6, 7};
        
        SortingContext sortingContext = new SortingContext();
        
        sortingContext.sort(data);
        
        System.out.println(Arrays.toString(data));

    }
}
