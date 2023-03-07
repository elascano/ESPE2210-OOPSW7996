package ec.espe.edu.strategy.controller;

import ec.espe.edu.strategy.model.Strategy;
import java.util.Arrays;
/**
 *
 * @author Sebastian Verdugo,ProgressTeam,DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {
    
    @Override
    public Strategy sort(Strategy strategy) {

        strategy.setSortAlgorithm("BubbleSort");

        int[] dataToSort = Arrays.copyOf(strategy.getUnsorted(), strategy.getUnsorted().length);
        int n = dataToSort.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dataToSort[j] > dataToSort[j + 1]) {
                    int temp = dataToSort[j];
                    dataToSort[j] = dataToSort[j + 1];
                    dataToSort[j + 1] = temp;
                }
            }
        }

        strategy.setSorted(dataToSort);
        return strategy;
    }
}
