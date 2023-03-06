package ec.edu.espe.exam3Strategy.controller;

import ec.edu.espe.exam3strategy.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */

public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public SortingStrategy setSortStrategy(int listOfNumbers[]) {

        if (listOfNumbers.length < 4 && listOfNumbers.length >= 0) {

            sortingStrategy = new BubbleSort();

        } else if (listOfNumbers.length >= 4 && listOfNumbers.length <= 7) {

            sortingStrategy = new InsertionSort();

        } else if (listOfNumbers.length > 7) {

            sortingStrategy = new QuickSort();

        }
        return sortingStrategy;
    }
}
