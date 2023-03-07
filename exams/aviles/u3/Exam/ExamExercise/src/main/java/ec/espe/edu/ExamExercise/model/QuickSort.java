package ec.espe.edu.ExamExercise.model;

public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        data = quicksort(data , 0 , data.length-1);
        return data;
    }
    
    public static int[] quicksort(int data[], int low, int high) {

        int pivote = data[low];
        int i = low;
        int j = high;
        int aux;

        while (i < j) {                                
            while (data[i] <= pivote && i < j) {
                i++;
            }
            while (data[j] > pivote) {
                j--;
            }
            if (i < j) {                   
                aux = data[i];
                data[i] = data[j];
                data[j] = aux;
            }
        }

        data[low] = data[j];                                
        data[j] = pivote;

        if (low < j - 1) {
            quicksort(data, low, j - 1);
        }
        if (j + 1 < high) {
            quicksort(data, j + 1, high);
        }
        return data;
    }
    
}
