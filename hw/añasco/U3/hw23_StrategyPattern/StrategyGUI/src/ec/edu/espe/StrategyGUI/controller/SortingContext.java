package ec.edu.espe.StrategyGUI.controller;

import ec.edu.espe.StrategyGUI.model.BubbleSort;
import ec.edu.espe.StrategyGUI.model.InsertionSort;
import ec.edu.espe.StrategyGUI.model.QuickSort;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public SortingStrategy setSortStrategy(int n) {
        if( n >0 && n < 30 ) {
            ss = new BubbleSort();} 
        else if ( n >= 30 && n < 100 ) {
            ss = new InsertionSort(); } 
        else if ( n >= 100 ) {
            ss = new QuickSort(); }
        
        return ss;
    }
    
    public int[ ] sort( int data[ ] ) {
        int size = data.length;
        ss = setSortStrategy(size);
        
        return ss.sort(data);
    }

    public SortingStrategy getSs() {
        return ss;
    }

}
