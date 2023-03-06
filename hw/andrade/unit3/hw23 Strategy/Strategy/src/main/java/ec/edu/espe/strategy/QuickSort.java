package ec.edu.espe.strategy;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int data[]) {
        System.out.println("QuickSort");
        boolean continuee = true;
        int cont = 0;
        while (continuee)
        {
            if(cont == (data.length - 1)){
                cont = 0;
            }
            if (data[cont + 1] <= data[cont])
            {
                int cup = data[cont];
                data[cont] = data[cont + 1];
                data[cont + 1] = cup;
            }
            int oks = 0;
            for (int i = 0; i < data.length; i++)
            {
                if (i < (data.length - 1))
                {
                    if (data[i + 1] >= data[i])
                    {
                        oks++;
                    }
                }
            }
            if (oks == (data.length - 1))
            {
                continuee = false;
            }
            cont++;
        }
        return data;
    }

}
