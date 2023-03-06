package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    private String strategy;
    
    public int[] sort(int data[]){
        int size = data.length;
        sortingStrategy = setSortingStrategy(size);
        return sortingStrategy.sort(data);
    }
    
    private SortingStrategy setSortingStrategy(int size){
        if(size > 0 && size <= 3){
            sortingStrategy = new BubbleSort();
            strategy = "BubbleSort";
        } else if(size <= 7){
            sortingStrategy = new InsertionSort();
            strategy = "InsertionSort";
        } else{
            sortingStrategy = new QuickSort();
            strategy = "QuickSort";
        }
        
        return sortingStrategy;
    }
    
    public String getStrategy(){
        return strategy;
    }
}
