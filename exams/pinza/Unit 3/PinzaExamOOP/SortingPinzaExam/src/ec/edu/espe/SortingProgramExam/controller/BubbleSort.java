/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortingProgramExam.controller;

import ec.edu.espe.SortingProgramExam.model.ListNumbers;
import java.util.Arrays;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class BubbleSort extends SortingStrategy {

    @Override
    public void sort(ListNumbers listOfNumbers) {

        int listOfNumbersAux[];

        listOfNumbersAux = Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), listOfNumbers.getListOfNumbersDisordered().length);

        for (int i = 0; i < listOfNumbers.getListOfNumbersDisordered().length - 1; ++i) {

            for (int j = 0; j < listOfNumbers.getListOfNumbersDisordered().length - i - 1; ++j) {

                if (listOfNumbersAux[j + 1] < listOfNumbersAux[j]) {

                    int swap = listOfNumbersAux[j];
                    listOfNumbersAux[j] = listOfNumbersAux[j + 1];
                    listOfNumbersAux[j + 1] = swap;

                }
            }
        }

        insertData(listOfNumbersAux, listOfNumbers);
    }

    private static void insertData(int listOfNumbersAux[], ListNumbers listOfNumbers) {
        listOfNumbers.setListOfNumberOrdered(listOfNumbersAux);
        listOfNumbers.setSortAlgorithm("BubbleSort");
        listOfNumbers.setSizeOfListOfNumbers(listOfNumbers.getListOfNumbersDisordered().length);
        listOfNumbers.setListOfNumbersDisordered(Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), listOfNumbersAux.length));
    }

}
