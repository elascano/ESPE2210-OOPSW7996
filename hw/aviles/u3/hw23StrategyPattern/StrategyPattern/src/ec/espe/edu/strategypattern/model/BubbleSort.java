package ec.espe.edu.strategypattern.model;

public class BubbleSort implements SortingStrategy {
    
    @Override
    public int[ ] sort( int data[ ]) {
        int i, j, aux;
        for (i = 0; i < data.length - 1; i++) {
            for (j = 0; j < data.length - i - 1; j++) {
                if (data[j + 1] < data[j]) {
                    aux = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = aux;
                }
            }
        }
        return data;
}
}