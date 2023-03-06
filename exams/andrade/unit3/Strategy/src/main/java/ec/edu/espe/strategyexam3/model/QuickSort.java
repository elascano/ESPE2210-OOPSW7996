package ec.edu.espe.strategyexam3.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        quickSort(data, 0, data.length - 1);
        return data;
    }

    public static void quickSort(int[] data, int first, int end) {
        if (first < end) {
            int index = partition(data, first, end);
            quickSort(data, first, index - 1);
            quickSort(data, index + 1, end);
        }
    }

    public static int partition(int[] data, int first, int end) {
        int pivot = data[end];
        int i = first - 1;
        for (int j = first; j <= end - 1; j++) {
            if (data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[end];
        data[end] = temp;
        return i + 1;
    }

}
