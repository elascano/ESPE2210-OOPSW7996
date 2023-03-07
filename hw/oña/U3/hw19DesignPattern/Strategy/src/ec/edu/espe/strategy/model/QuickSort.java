
package ec.edu.espe.strategy.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy{
    @Override
    public void sort(int[] data){
        System.out.println("QuickSort"); 
        quicksort(data, 0, data.length - 1);
    }

    private static int split(int data[], int left, int right) {
        int pivot = data[left];
        while (true) {
            while (data[left] < pivot) { 
                left++;
            }
            while (data[right] > pivot) { 
                right--;
            }
            if (left >= right) {
                return right;
            } else {
                int temp = data[left]; 
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }
    }

    private static void quicksort(int data[], int left, int right) {
        if (left < right) {
            int pivotIndex = split(data, left, right);
            quicksort(data, left, pivotIndex);
            quicksort(data, pivotIndex + 1, right);
        }
    }
}



