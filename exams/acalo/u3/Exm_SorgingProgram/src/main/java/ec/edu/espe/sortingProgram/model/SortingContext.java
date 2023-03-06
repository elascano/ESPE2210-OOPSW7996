/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.sortingProgram.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class SortingContext{

    private SortingStrategy sortStrategy;

    public int[] sort(int data[]) {

        int size = data.length;

        setSortStrategy(setSortStrategy(size));
        
        return getSortStrategy().sort(data);

    }
    
    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 30) {
            setSortStrategy(new BubbleSort());
        }

        if (n >= 30 && n < 100) {
            setSortStrategy(new InsertionSort());
        }

        if (n >= 100) {
            setSortStrategy(new QuickSort());
        }

        return getSortStrategy();

    }

    public SortingStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortingStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    
    
}

