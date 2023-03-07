package ec.espe.edu.strategypattern.model;

public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        
        int p, j;
        int aux;
        for (p = 1; p < data.length; p++) {
            aux = data[p];
            j = p - 1;
            while ((j >= 0) && (aux < data[j])) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux;
        }
        
        return data;
    }
}
