package ec.espe.edu.strategypattern.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        System.out.println("\t | Method used: Insertion Sort | ");
        int n = data.length;
        for (int i = 1; i < n; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
        return data;
    }
}
