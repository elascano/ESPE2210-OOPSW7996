
package ec.edu.espe.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */

public class partition {

    public static int partition(int[] numbers, int low, int high)
    {
        int pivot = numbers[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) 
        {
            if (numbers[j] < pivot) 
            {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        return 0;
         }
     }
