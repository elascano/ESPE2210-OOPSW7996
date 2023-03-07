package ec.edu.espe.sort.model;
/**
 *
 * @author Martín Suquillo,WebMasterTeam, DCCO-ESPE
 */
public class BubbleSort implements SortingStrategy {
public int[] sort(int[] inputArray) {
int arrayLength = inputArray.length;
int tempValue = 0;
for (int i = 0; i < arrayLength; i++) {
for (int j = 1; j < (arrayLength - i); j++) {
if (inputArray[j - 1] > inputArray[j]) {
tempValue = inputArray[j - 1];
inputArray[j - 1] = inputArray[j];
inputArray[j] = tempValue;
}
}
}
return inputArray;
}
}