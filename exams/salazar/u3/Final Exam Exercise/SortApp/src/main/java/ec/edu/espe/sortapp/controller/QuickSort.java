package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy{
    @Override
    public int[] sort(int data[]){
        int sortedData[], dataLen;
        dataLen = data.length;
        
        sortedData = new int[dataLen];
        System.arraycopy(data, 0, sortedData, 0, dataLen);
        
        quickSort(sortedData, 0, dataLen - 1);
        return sortedData;
    }
    
    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
    
    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = choosePivotIndex(left, right);
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        swap(arr, storeIndex, right);
        return storeIndex;
    }
    
    private static int choosePivotIndex(int left, int right) {
        return (left + right) / 2;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
