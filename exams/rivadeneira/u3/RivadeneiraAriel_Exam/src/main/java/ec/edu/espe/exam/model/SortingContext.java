package ec.edu.espe.exam.model;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data []){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<=3){
            System.out.println("Apply Bubble Sort");
            ss = new BubbleSort();
        }
        if(n>4 && n<=7){
            System.out.println("Apply Insertion Sort");
            ss = new InsertionSort();
        }
        if(n> 7){
            System.out.println("Apply Quick Sort");
            ss = new QuickSort();
        }
        return ss;
    }

    
}
