package ec.edu.espe.strategypattern.model;
/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        System.out.println("QuickSort");
        quickSort(data, 0, data.length - 1);
        return data;
    }

    public static void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }

}
