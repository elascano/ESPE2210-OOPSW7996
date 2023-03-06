package ec.edu.espe.strategy.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public void sort(int[] data) {
        int j;
        int temp;
        int size;
        
        System.out.println("InsertionSort");
        
        size = data.length;
        for (int i = 1; i < size; i++){
            temp = data[i];
            j = i -1;
            while  (j >= 0 && temp <= data[j]){
                data[j + 1] = data[j];
                j = j-1;
            }
            data[j+1] = temp;
        }
    }
}
