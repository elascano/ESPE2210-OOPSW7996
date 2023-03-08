package ec.edu.espe.StrategyGUI.model;

import ec.edu.espe.StrategyGUI.controller.SortingStrategy;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        final int n = data.length;
        quickSort(data,0,n-1);
        
        return data;
    }
    
    public void quickSort(int data[], int start, int end){
        if(start >= end) return;
        
        int pivot = data[start];
        int leftElement = start + 1;
        int rightElement = end;
                
        while(leftElement <= rightElement){
            while(leftElement <= end && data[leftElement] < pivot){
                leftElement++;
            }
            
            while(rightElement > start && data[rightElement] >= pivot){
                rightElement--;
            }
                        
            if(leftElement < rightElement){
                int temp = data[leftElement];
                data[leftElement] = data[rightElement];
                data[rightElement] = temp;
            }
        }
                
        if(rightElement > start){
            int temp = data[start];
            data[start] = data[rightElement];
            data[rightElement] = temp;
        }
                
        quickSort(data, start, rightElement-1);
        quickSort(data, rightElement+1, end);
    }
}