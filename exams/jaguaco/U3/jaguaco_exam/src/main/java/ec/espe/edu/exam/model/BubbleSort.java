package ec.espe.edu.exam.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] array) {
        if (array.length < 0 || array.length > 3) {
            return null;
        }

        // Algoritmo de ordenamiento de burbuja
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // Intercambio de elementos
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}
