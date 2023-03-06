package ec.edu.espe.strategy;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public int[] sort(int data[]) {
        sortingStrategy = setSortStrategy(data.length);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 3)
        {
            sortingStrategy = new BubbleSort();
        }
        if (n >= 3 && n < 5)
        {
            sortingStrategy = new InsertionSort();
        }
        if (n >= 5)
        {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }

}
