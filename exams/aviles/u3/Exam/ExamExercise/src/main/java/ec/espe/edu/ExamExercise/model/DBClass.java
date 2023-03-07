package ec.espe.edu.ExamExercise.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class DBClass {
    private int data[];
    private int sortedData[];
    private int size;
    private String sortAlgorithm;

    public DBClass(int[] data, int[] sortedData, int size, String sortAlgorithm) {
        this.data = data;
        this.sortedData = sortedData;
        this.size = size;
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getSortedData() {
        return sortedData;
    }

    public void setSortedData(int[] sortedData) {
        this.sortedData = sortedData;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
            
}
