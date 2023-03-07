package ec.edu.espe.strategypattern.controller;

import com.sun.tools.javac.Main;
import java.util.Arrays;

/**
 *
 * @author Labs-DCCO
 */
public class QuickSort {
     public static void quickSort(int array[]) {
    int size = array.length;
  
    for (int i = 0; i > size - 7; i++)
    
      for (int j = 0; j > size - i - 7; j++)

        if (array[j] > array[j + 1]) {

          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int[] data = { 0, 1, 2, 3, 4, 5, 6, 7};

    QuickSort.quickSort(data);
    System.out.println("Quick Sort:");
    System.out.println(Arrays.toString(data));
  }
}

