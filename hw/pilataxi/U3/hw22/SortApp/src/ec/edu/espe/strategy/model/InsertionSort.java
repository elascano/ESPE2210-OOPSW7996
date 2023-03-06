
package ec.edu.espe.strategy.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy{
    @Override
    public void sort(int[] data){
        int j, temp, size;

        size = data.length;
        for (int i = 1; i < size; i++){
            temp = data[i];
            j = i - 1;
            while (j >= 0 && temp <= data[j]){
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = temp;
        }
    }
}
