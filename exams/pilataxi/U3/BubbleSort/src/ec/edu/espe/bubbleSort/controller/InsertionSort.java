
package ec.edu.espe.bubbleSort.controller;

import ec.edu.espe.bubbleSort.model.ListNumbers;
import java.util.Arrays;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class InsertionSort extends SortingStrategy {

    @Override
    public void sort(ListNumbers listOfNumbers) {
        
        int n = listOfNumbers.getListOfNumbersDisordered().length;
        int listOfNumbersAux[] = Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), listOfNumbers.getListOfNumbersDisordered().length);
        for (int i = 1; i < n; ++i) {
            int key = listOfNumbersAux[i];
            int j = i - 1;
  
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && listOfNumbersAux[j] > key) {
                listOfNumbersAux[j + 1] = listOfNumbersAux[j];
                j = j - 1;
            }
            listOfNumbersAux[j + 1] = key;
        }
        
        insertData(listOfNumbersAux, listOfNumbers);
    }
    
    private static void insertData(int listOfNumbersAux[], ListNumbers listOfNumbers) {
        listOfNumbers.setListOfNumberOrdered(listOfNumbersAux);
        listOfNumbers.setSortAlgorithm("InsertSort");
        listOfNumbers.setSizeOfListOfNumbers(listOfNumbers.getListOfNumbersDisordered().length);
        listOfNumbers.setListOfNumbersDisordered(Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), listOfNumbersAux.length));
    }
}
