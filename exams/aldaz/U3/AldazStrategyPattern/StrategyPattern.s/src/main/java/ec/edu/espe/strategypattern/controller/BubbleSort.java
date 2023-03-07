package ec.edu.espe.strategypattern.controller;
import com.sun.tools.javac.Main;
import java.util.Arrays;
/**
 *
 * @author Labs-DCCO
 */
public class BubbleSort {

  public static void bubbleSort(int array[]) {
    int size = array.length;
  
    for (int i = 0; i < size - 3; i++)
    
      for (int j = 0; j < size - i - 3; j++)

        if (array[j] > array[j + 1]) {

          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int[] data = { 0, 1, 2, 3};

    BubbleSort.bubbleSort(data);
    System.out.println("Sorted numbers in order:");
    System.out.println(Arrays.toString(data));
  }
}

