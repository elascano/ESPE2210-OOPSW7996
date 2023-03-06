package ec.espe.edu.strategypattern.view;

import ec.espe.edu.strategypattern.model.SortingContext;
import java.util.Arrays;

public class SortApp {
    public static void main(String args[ ]) {
        int data[ ] = {3,6,4,6,7,8,5,6,7,5,3,3};
        SortingContext sc = new SortingContext();
        int sortedList[ ] = sc.sort(data);
        String a;
        a = Arrays.toString(data);
        System.out.println(a);
        System.out.println(Arrays.toString(data));
    }
}
