
package ec.edu.espe.examFinal.controller;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public interface SortingStrategy {

    public int[] sort(int data[]);
    public int[] sort(int data[],int low, int high);
    
}
