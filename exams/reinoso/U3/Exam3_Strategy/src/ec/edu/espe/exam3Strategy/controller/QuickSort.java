package ec.edu.espe.exam3Strategy.controller;

import ec.edu.espe.exam3strategy.model.ListNumbers;
import java.util.Arrays;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */

public class QuickSort extends SortingStrategy {

    @Override
    public void sort(ListNumbers listOfNumbers) {
        int high;
        int numbers[] = Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), listOfNumbers.getListOfNumbersDisordered().length);
        high = listOfNumbers.getListOfNumbersDisordered().length;

        sort(numbers, 0, high - 1, listOfNumbers);

    }

    private static void insertData(int array[], ListNumbers listOfNumbers) {
        listOfNumbers.setListOfNumberOrdered(array);
        listOfNumbers.setSortAlgorithm("Quick Short");
        listOfNumbers.setSizeOfListOfNumbers(listOfNumbers.getListOfNumbersDisordered().length);
        listOfNumbers.setListOfNumbersDisordered(Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), array.length));
    }

    public static void sort(int number[], int start, int fin, ListNumbers listNumbers) {
        if (start >= fin) {
            return;
        }
        int pivot = number[start];
        int left = start + 1;
        int right = fin;

        while (left <= right) {
            while (left <= fin && number[left] < pivot) {
                left++;
            }
            while (right > start && number[right] >= pivot) {
                right--;
            }
            if (left < right) {
                int temporary = number[left];
                number[left] = number[right];
                number[right] = temporary;
            }
        }
        if (right > start) {
            int temporary = number[start];
            number[start] = number[right];
            number[right] = temporary;
        }
        sort(number, start, right - 1, listNumbers);
        sort(number, right + 1, fin, listNumbers);
        insertData(number, listNumbers);
    }

}
