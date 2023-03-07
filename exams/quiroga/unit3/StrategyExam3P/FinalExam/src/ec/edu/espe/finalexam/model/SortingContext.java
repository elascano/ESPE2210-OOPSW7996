/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.finalexam.model;

import ec.edu.espe.finalexam.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public void sort() {

    }

    public SortingStrategy setSortStrategy(int listOfNumbers[]) {

        if (listOfNumbers.length < 4 && listOfNumbers.length >= 0) {

            sortingStrategy = new BubbleSort();

        } else if (listOfNumbers.length >= 4 && listOfNumbers.length <= 7) {

            sortingStrategy = new InsertionSort();

        } else if (listOfNumbers.length > 7) {

            sortingStrategy = new QuickSort();

        }
        return sortingStrategy;
    }
}
