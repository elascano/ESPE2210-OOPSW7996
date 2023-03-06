package ec.espe.edu.strategypattern.model;

public class SortingContext {
    
    private SortingStrategy ss;
    
    public int[ ] sort( int data[ ] ) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
}
public SortingStrategy setSortStrategy(int n) {
    if( n >0 && n < 30 ) {
        ss = new BubbleSort();} 
    else if ( n >= 30 && n < 100 ) {
        ss = new InsertionSort(); } 
    else if ( n >= 100 ) {
        ss = new QuickSort(); }
    return ss;
    }
}