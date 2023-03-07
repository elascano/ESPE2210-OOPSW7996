package ec.edu.espe.sort.model;

/**
 *
 * @author Carlos Granda DCCO-ESPE, Syntax Error
 */
public class BubbleSort implements SortingStrategy {
    public int[] sort(int data[]) {
        int number = data.length;
        int temp = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 1; j < (number - i); j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
