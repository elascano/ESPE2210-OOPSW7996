package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy{
    @Override
    public int[] sort(int data[]){
        int dataLen, auxiliar, sortedData[];
        dataLen = data.length;
        
        sortedData = new int[dataLen];
        System.arraycopy(data, 0, sortedData, 0, dataLen);
        
        for (int i = 0; i <dataLen-1; i++) {
            for (int j = 0; j < dataLen-1; j++) {
                if (sortedData[j] > sortedData[j+1]){
                    auxiliar = sortedData[j];
                    sortedData[j] = sortedData[j+1];
                    sortedData[j+1] = auxiliar;
                }
            }
        }
        
        return sortedData;
    }
}
