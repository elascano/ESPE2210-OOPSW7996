/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public void sort(int[] data) {
        int j, temp, size;
        
        System.out.println("InsertionSort");
        
        size = data.length;
        for (int i = 1; i < size; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && temp <= data[j]) /* Move the elements greater than temp to one position ahead from their current position*/ {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = temp;
        }
    }
}
