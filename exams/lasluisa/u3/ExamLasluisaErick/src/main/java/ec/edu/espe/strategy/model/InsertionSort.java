package ec.edu.espe.strategy.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public void sort(int[] itemsForSort) {
        int numberOfItems = itemsForSort.length;
        for (int i = 1; i < numberOfItems; ++i) {
            int key = itemsForSort[i];
            int j = i - 1;

            while (j >= 0 && itemsForSort[j] > key) {
                itemsForSort[j + 1] = itemsForSort[j];
                j = j - 1;
            }
            itemsForSort[j + 1] = key;
        }
    }

}
