package ec.edu.espe.exam.model;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
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
