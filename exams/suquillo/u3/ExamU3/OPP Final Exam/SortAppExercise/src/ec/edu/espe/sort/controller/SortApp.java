package ec.edu.espe.sort.controller;

import ec.edu.espe.sort.model.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Martín Suquillo,WebMasterTeam, DCCO-ESPE
 */
    public class SortApp {
    public static void main(String[] args) {
    int[] dataArray = {12, 12, 111, 9, 6, 2, 2, 8, 6, 3, 5, 2, 35, 6, 3, 2, 2};
    System.out.println("Data --> " + Arrays.toString(dataArray));
    SortingContext sortingContext = new SortingContext();
    int[] sortedDataArray = sortingContext.sort(dataArray);
}
    }
