package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int[] sort(int data[]){
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<30){
            sortingStrategy = new BubbleSort();
        }
        
        if(n >= 30 && n<100){
            sortingStrategy = new InsertionSort();
        }
        
        if (n >=100){
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
