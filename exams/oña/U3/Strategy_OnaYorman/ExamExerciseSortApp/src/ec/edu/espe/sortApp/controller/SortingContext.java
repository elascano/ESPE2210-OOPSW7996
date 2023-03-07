
package ec.edu.espe.sortApp.controller;

import ec.edu.espe.sortApp.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
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
