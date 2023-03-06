package ec.edu.espe.strategy.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public String sort(int[] data) {
        int j, temp, size;
        
        System.out.println("InsertionSort");
        
        size = data.length;
        for (int i = 1; i < size; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && temp <= data[j]) /* Move the elements greater than temp to one position ahead from their current position*/ {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = temp;
        }
        
        return "InsertionSort";
    }
}
