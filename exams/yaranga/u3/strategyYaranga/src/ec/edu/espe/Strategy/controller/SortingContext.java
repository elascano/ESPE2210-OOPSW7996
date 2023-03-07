package ec.edu.espe.Strategy.controller;

import ec.edu.espe.Strategy.model.Strategy;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
// the context class
public class SortingContext implements SortingStrategy {

    private SortingStrategy sortingStrategy;

   
    
    @Override
    public Strategy sort(Strategy strategy) {

        int size = strategy.getUnsorted().length;

        sortingStrategy = setSortStrategy(size);

        return sortingStrategy.sort(strategy);
    }

    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 3) {
            sortingStrategy = new BubbleSort();
        }

        if (n >= 4 && n <= 7) {
            sortingStrategy = new InsertionSort();
        }

        if (n > 7) {
            sortingStrategy = new QuickSort();
        }

        return sortingStrategy;

    }

}
