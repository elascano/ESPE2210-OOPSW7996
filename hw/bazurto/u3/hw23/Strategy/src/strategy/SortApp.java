/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import ec.edu.espe.Strategy.model.SortingContext;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class SortApp {
public static void main(String args[ ]) {
int data[ ] = {3,6,4,6,7,8,5,6,7,5,3,3};
SortingContext sc = new SortingContext();
int sortedList[ ] = sc.sort(data);
}
}