package ec.edu.espe.strategy.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] itemsForSort) {
        int numberOfItems = itemsForSort.length;
        for (int i = 0; i < (numberOfItems - 1); i++) {
            for (int j = 0; j < (numberOfItems - 1 - i); j++) {
                if (itemsForSort[j] > itemsForSort[i]) {
                    int temporaryNumber = itemsForSort[j];
                    itemsForSort[j] = itemsForSort[j+1];
                    itemsForSort[j+1] = temporaryNumber;
                }
            }
        }
    }

}
