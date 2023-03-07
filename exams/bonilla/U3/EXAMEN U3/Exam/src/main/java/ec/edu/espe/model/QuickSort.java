
package ec.edu.espe.model;

import static ec.edu.espe.model.partition.partition;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class QuickSort {

    public static void QuickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pi = partition(numbers, low, high);

            QuickSort(numbers, low, pi - 1);
            QuickSort(numbers, pi + 1, high);
        }
    }
}
