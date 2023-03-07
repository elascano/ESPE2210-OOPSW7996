
package ec.edu.espe.finalExam.controller;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class QuickSort {
    public void sort(int[] arr) {
        int number3 = arr.length;
        for (int i = 0; i < number3-1; i++) {
            for (int j = 0; j < number3-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
