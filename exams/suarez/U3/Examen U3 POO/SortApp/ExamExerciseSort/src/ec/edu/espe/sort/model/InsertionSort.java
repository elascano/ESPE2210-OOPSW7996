package ec.edu.espe.sort.model;

/**
 *
 * @author Carlos Granda DCCO-ESPE, Syntax Error
 */
public class InsertionSort implements SortingStrategy {

    public int[] sort(int data[]) {
        int number = data.length;
        for (int j = 1; j < number; j++) {
            int key = data[j];
            int i = j - 1;
            while ((i > -1) && (data[i] > key)) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        return data;
    }
}
