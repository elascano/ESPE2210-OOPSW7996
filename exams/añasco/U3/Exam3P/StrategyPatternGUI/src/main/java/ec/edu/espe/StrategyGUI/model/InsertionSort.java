package ec.edu.espe.StrategyGUI.model;

import ec.edu.espe.StrategyGUI.controller.SortingStrategy;

/* This code is contributed by Rajat Mishra. */

public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;
 
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return data;
    }
}
