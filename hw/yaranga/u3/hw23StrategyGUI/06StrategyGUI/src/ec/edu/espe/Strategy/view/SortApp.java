package ec.edu.espe.Strategy.view;

import ec.edu.espe.Strategy.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 * modified by Leonardo Yaranga
 */
public class SortApp {

    // client application class
    public static void main(String[] args) {

        int data[] = {3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3,3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3,5};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);

        System.out.println("Ordered numbers: " + Arrays.toString(sortedList));
    }

}
