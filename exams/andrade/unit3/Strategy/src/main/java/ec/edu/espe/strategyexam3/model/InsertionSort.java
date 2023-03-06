
package ec.edu.espe.strategyexam3.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        
        for (int i = 1; i < data.length; i++) {
            
            int actualValue = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > actualValue) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = actualValue;
        }
        
        return data;
    }
    
}
