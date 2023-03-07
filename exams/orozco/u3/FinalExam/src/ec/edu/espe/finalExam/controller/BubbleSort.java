package ec.edu.espe.finalExam.controller;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {
    public void sort(int[] arr) {
        int number1 = arr.length;
        for (int i = 0; i < number1-1; i++) {
            for (int j = 0; j < number1-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
