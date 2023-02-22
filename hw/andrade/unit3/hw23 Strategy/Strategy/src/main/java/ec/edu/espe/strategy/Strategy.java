
package ec.edu.espe.strategy;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE 
 */
public class Strategy {

    public static void main(String[] args) {
        int data[] = {1, 4, 2, 5, 2};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        
        System.out.print("Sorted List: ");
        for(int i = 0; i < sortedList.length; i++){
            System.out.print(sortedList[i] + " ");
        }
    }
}
