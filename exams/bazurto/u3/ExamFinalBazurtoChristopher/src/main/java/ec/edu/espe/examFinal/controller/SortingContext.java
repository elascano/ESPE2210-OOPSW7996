/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examFinal.controller;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class SortingContext {

    private SortingStrategy strategy;

    public int[] sort(int data[]) {
        int size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n <= 3) {
            strategy = new BubbleSort();
        }
        if (n > 4 && n <= 7) {
            strategy = new InsertionSort();
        }
        if (n > 7) {
            strategy = new QuickSort();
        }
        return strategy;
    }
    public String selectedSortMethod(int n) {
        
        String selectedSortMethod = null;
        
        if (n > 0 && n <= 3) {
            selectedSortMethod = "BubbleSort";
        }
        if (n > 4 && n <= 7) {
            selectedSortMethod = "InsertionSort";
        }
        if (n > 7) {
            selectedSortMethod = "QuickSort";
        }
        return selectedSortMethod;
    }
}
