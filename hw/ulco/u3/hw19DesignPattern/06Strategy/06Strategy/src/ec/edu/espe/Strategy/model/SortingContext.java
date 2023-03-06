package ec.edu.espe.Strategy.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
// the context class
public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int data[]) {

        int size = data.length;

        ss = setSortStrategy(size);

        return ss.sort(data);

    }

    // choose the sort strategy depending on
    // data size; separate the selection of the
    // algorithm from the implementation
    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 30) {
            ss = new BubbleSort();
        }

        if (n >= 30 && n < 100) {
            ss = new InsertionSort();
        }

        if (n >= 100) {
            ss = new QuickSort();
        }

        return ss;

    }
}
