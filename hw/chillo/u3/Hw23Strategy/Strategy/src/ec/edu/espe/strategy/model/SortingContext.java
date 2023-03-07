package ec.edu.espe.strategy.model;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class SortingContext {
    
    private SortingStrategy sortingStrategy;
    
    public void sort(int data[]){
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        sortingStrategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if (n > 0 && n < 30){
            sortingStrategy = new BubbleSort();
        }else if (n >= 30 && n < 100){
            sortingStrategy = new InsertionSort();
        }else if(n >= 100){
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }   
}
