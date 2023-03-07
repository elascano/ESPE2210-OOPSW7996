package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int[] sort(int data[]){
        int size = data.length;
        int sortedData[];
        
        sortingStrategy = setSortStrategy(size);
        sortedData = sortingStrategy.sort(data);
        return sortedData;
    }
    
    private SortingStrategy setSortStrategy(int size){
        if(size > 0 && size <= 3){
            sortingStrategy = new BubbleSort();
        }else if(size > 4 && size <=7){
            sortingStrategy = new InsertionSort();
        }else{
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
