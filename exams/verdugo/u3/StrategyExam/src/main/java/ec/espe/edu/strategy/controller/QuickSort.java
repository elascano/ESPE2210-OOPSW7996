package ec.espe.edu.strategy.controller;

import ec.espe.edu.strategy.model.Strategy;
import java.util.Arrays;
/**
 *
 * @author Sebastian Verdugo,ProgressTeam,DCCO-ESPE
 */
public class QuickSort implements SortingStrategy {

    @Override
    public Strategy sort(Strategy strategy) {

        int[] dataToOrder = Arrays.copyOf(strategy.getUnsorted(), strategy.getSize());

        int sortedData[];

        strategy.setSortAlgorithm("QuickSort");

        sortedData = quickSort(dataToOrder, 0, dataToOrder.length - 1);

        strategy.setSorted(sortedData);
        return strategy;
    }

    private int[] quickSort(int[] data, int low, int high) {

        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }

        return data;

    }

    static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }

}
