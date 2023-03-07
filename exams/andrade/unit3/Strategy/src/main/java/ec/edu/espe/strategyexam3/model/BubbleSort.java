
package ec.edu.espe.strategyexam3.model;

import ec.edu.espe.strategyexam3.model.SortingStrategy;
import java.util.Arrays;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
    
}
