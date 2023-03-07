package ec.edu.espe.strategy.controller;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public String sort(int[] data) {
        int size = data.length;
        int temp;
        
        System.out.println("BubbleSort");

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (data[j - 1] > data[j]) {
                    //swap elements  
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        
        return "BubbleSort";
    }
}
