package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy{
    @Override
    public int[] sort(int data[]){
        int sortedData[], dataLen;
        dataLen = data.length;
        
        sortedData = new int[dataLen];
        System.arraycopy(data, 0, sortedData, 0, dataLen);
        
        for (int i = 1; i < dataLen; ++i) {
            int key = sortedData[i];
            int j = i - 1;
 
            while (j >= 0 && sortedData[j] > key) {
                sortedData[j + 1] = sortedData[j];
                j = j - 1;
            }
            sortedData[j + 1] = key;
        }
        return sortedData;
    }
}
