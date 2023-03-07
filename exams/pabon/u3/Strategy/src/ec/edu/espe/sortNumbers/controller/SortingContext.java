package ec.edu.espe.sortNumbers.controller;

import ec.edu.espe.sortNumbers.model.Numbers;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public SortingStrategy setSortStrategy(int[] listOfDigits, Numbers listDigits) {

        if (listOfDigits.length < 4 && listOfDigits.length >= 0) {

            sortingStrategy = new BubbleSort();

        } else if (listOfDigits.length >= 4 && listOfDigits.length <= 7) {

            sortingStrategy = new InsertionSort();

        } else if (listOfDigits.length > 7) {

            sortingStrategy = new QuickSort();

        }
        return sortingStrategy;
    }
}
