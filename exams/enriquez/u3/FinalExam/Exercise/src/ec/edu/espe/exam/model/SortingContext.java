package ec.edu.espe.exam.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n <4) {
            ss = new BubbleSort();
        } else if (n >= 4 && n < 7) {
            ss = new InsertionSort();
        } else if (n >= 7) {
            ss = new QuickSort();
        }
        return ss;
    } 
}
