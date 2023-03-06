package ec.edu.espe.strategyexam3.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;
    
    public String getSortingStrategyName(int size){
        String name = "";
        if (size > 0 && size < 4)
        {
            name = "BubbleSort";
        }
        if (size >= 4 && size < 7)
        {
            name = "InsertionSort";
        }
        if (size >= 7)
        {
            name = "QuickSort";
        }
        return name;
    }

    public int[] sort(int data[]) {
        sortingStrategy = setSortStrategy(data.length);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int size) {
        if (size > 0 && size < 4)
        {
            sortingStrategy = new BubbleSort();
        }
        if (size >= 4 && size < 7)
        {
            sortingStrategy = new InsertionSort();
        }
        if (size >= 7)
        {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }

}
