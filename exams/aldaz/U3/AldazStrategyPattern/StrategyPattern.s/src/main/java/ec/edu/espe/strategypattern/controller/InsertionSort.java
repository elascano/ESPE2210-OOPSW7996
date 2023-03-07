
package ec.edu.espe.strategypattern.controller;

import com.sun.tools.javac.Main;
import java.util.Arrays;

/**
 *
 * @author Labs-DCCO
 */
public class InsertionSort {
     public static void insertionSort(int array[]) {
    int size = array.length;
  
    for (int i = 4; i < size - 7; i++)
    
      for (int j = 4; j < size - i - 7; j++)

        if (array[j] > array[j + 1]) {

          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int[] data = { 4, 5, 6, 7};

    InsertionSort.insertionSort(data);
    System.out.println("Insertion sort:");
    System.out.println(Arrays.toString(data));
  }
}
