package ec.edu.espe.strategypattern.model;
/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy {
    
    @Override
    public int[ ] sort( int data[ ]) {
        System.out.println("Insertion Sort");
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
