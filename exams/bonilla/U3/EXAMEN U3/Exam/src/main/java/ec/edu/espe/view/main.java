
package ec.edu.espe.view;

import static ec.edu.espe.model.BubbleSort.BubbleSort;
import static ec.edu.espe.model.InsertionSort.InsertionSort;
import static ec.edu.espe.model.QuickSort.QuickSort;
import java.util.Arrays;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class main {
    public static void main(String[] args) {
    int[] numbers = {7, 3, 9, 2, 6, 1, 8, 5, 4};
    int size = numbers.length;
    String algorithm;
    
    if (size <= 3) {
      algorithm = "BubbleSort";
      BubbleSort(numbers);
    } else if (size >= 4 && size <= 7) {
      algorithm = "InsertionSort";
      InsertionSort(numbers);
    } else {
      algorithm = "QuickSort";
      QuickSort(numbers, 0, size - 1);
    }
    
    System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}