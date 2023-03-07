package ec.edu.espe.strategy.model;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public void sort(int[] data) {
        int size = data.length;
        int temp;
        
        System.out.println("BubbleSort");
        
        for (int i = 0; i < size; i++){
            for (int j = 1; j <  (size - i); j++){
                if (data[j - 1] > data[j]){
                    temp = data[j - 1];
                    data[j - 1]  =  data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
