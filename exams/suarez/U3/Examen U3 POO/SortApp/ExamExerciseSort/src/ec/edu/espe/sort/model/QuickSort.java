package ec.edu.espe.sort.model;

/**
 *
 * @author Carlos Granda DCCO-ESPE, Syntax Error
 */
public class QuickSort implements SortingStrategy {

    public int[] sort(int data[]) {

        return sort(data, 0, data.length - 1);
    }

    public int[] sort(int data[], int left, int right) {
        if (left >= right) {
            return data;
        }
        int i = left;
        int j = right;
        if (left != right) {
            int pivot;
            int aux;
            pivot = left;
            while (left != right) {
                while (data[right] >= data[pivot] && left < right) {
                    right--;
                }
                while (data[left] < data[pivot] && left < right) {
                    left++;
                }
            if(right!=left){
                aux = data[right];
                data[right]=data[left];
                data[left]=aux;
            }
            if(left==right){
                sort(data, i, left-1);
                sort(data, left+1, j);
            }
            } 
        }else
            return data;
        return data;
    }

}
