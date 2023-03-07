package ec.edu.espe.sort.model;
/**
 *
 * @author Martín Suquillo,WebMasterTeam, DCCO-ESPE
 */
public class InsertionSort implements SortingStrategy {
public int[] sort(int dataArray[]) {
int length = dataArray.length;
for (int j = 1; j < length; j++) {
int key = dataArray[j];
int i = j - 1;
while ((i > -1) && (dataArray[i] > key)) {
dataArray[i + 1] = dataArray[i];
i--;
}
dataArray[i + 1] = key;
}
return dataArray;
}
}
