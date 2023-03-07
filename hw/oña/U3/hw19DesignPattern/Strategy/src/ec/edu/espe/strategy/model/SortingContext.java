
package ec.edu.espe.strategy.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public void sort(int data[]) {
        int size = data.length;
        setSortStrategy(size);
        sortingStrategy.sort(data);
    }

    public void setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            sortingStrategy = new BubbleSort();
        } else if (n >= 30 && n < 100) {
            sortingStrategy = new InsertionSort();
        } else if (n >= 100) {
            sortingStrategy = new QuickSort();
        }
    }
}

