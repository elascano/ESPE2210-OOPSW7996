/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 30) {
            sortingStrategy = new BubbleSort();
        } else if (n >= 30 && n < 100) {
            sortingStrategy = new InsertionSort();
        } else if (n >= 100) {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
