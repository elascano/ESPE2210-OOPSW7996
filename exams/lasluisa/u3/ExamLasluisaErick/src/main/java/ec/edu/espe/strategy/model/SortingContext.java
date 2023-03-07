package ec.edu.espe.strategy.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy strategy;
    
    public SortingContext(SortingStrategy strategy){
        this.strategy = strategy;
    }
    
    public void setSortStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }
    
    public void sort(int[] itemsForSort){
        strategy.sort(itemsForSort);
    }
}
