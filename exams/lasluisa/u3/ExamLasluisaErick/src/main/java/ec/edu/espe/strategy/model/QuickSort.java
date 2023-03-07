package ec.edu.espe.strategy.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy {

    @Override
    public void sort(int[] itemsForSort) {
        quickSort(itemsForSort, 0, itemsForSort.length - 1);
    }

    private void quickSort(int[] itemsForSort, int lowerItem, int higherItem) {
        if (lowerItem < higherItem) {
            int pi = partition(itemsForSort, lowerItem, higherItem);

            quickSort(itemsForSort, lowerItem, pi - 1);
            quickSort(itemsForSort, pi + 1, higherItem);
        }
    }

    private int partition(int[] itemsForSort, int lowerItem, int higherItem) {
        int pivot = itemsForSort[higherItem];
        int i = (lowerItem - 1);

        for (int j = lowerItem; j <= higherItem - 1; j++) {
            if (itemsForSort[j] < pivot) {
                i++;
                int temp = itemsForSort[i];
                itemsForSort[i] = itemsForSort[j];
                itemsForSort[j] = temp;
            }
        }
        int temp = itemsForSort[i + 1];
        itemsForSort[i + 1] = itemsForSort[higherItem];
        itemsForSort[higherItem] = temp;
        return (i + 1);
    }

}
