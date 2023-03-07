package ec.espe.edu.strategy.controller;

import ec.espe.edu.strategy.model.Strategy;
import java.util.Arrays;
/**
 *
 * @author Sebastian Verdugo,ProgressTeam,DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public Strategy sort(Strategy strategy) {

        strategy.setSortAlgorithm("InsertionSort");

        int[] dataToSOrt = Arrays.copyOf(strategy.getUnsorted(), strategy.getSize());

        int n = dataToSOrt.length;
        for (int i = 1; i < n; ++i) {
            int key = dataToSOrt[i];
            int j = i - 1;
            while (j >= 0 && dataToSOrt[j] > key) {
                dataToSOrt[j + 1] = dataToSOrt[j];
                j = j - 1;
            }
            dataToSOrt[j + 1] = key;
        }
        strategy.setSorted(dataToSOrt);

        return strategy;

    }
}