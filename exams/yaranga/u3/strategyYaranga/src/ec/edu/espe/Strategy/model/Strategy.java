
package ec.edu.espe.Strategy.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Strategy {

    private int[] unsorted;
    private int size;
    private String sortAlgorithm;
    private int[] sorted;

    public Strategy() {
        this.unsorted = null;
        this.size = 0;
        this.sortAlgorithm = "";
        this.sorted = null;
    }

    public Strategy(int[] unsorted, int size, String sortAlgorithm, int[] sorted) {
        this.unsorted = unsorted;
        this.size = size;
        this.sortAlgorithm = sortAlgorithm;
        this.sorted = sorted;
    }

    /**
     * @return the unsorted
     */
    public int[] getUnsorted() {
        return unsorted;
    }

    /**
     * @param unsorted the unsorted to set
     */
    public void setUnsorted(int[] unsorted) {
        this.unsorted = unsorted;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the sortAlgorithm
     */
    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    /**
     * @param sortAlgorithm the sortAlgorithm to set
     */
    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    /**
     * @return the sorted
     */
    public int[] getSorted() {
        return sorted;
    }

    /**
     * @param sorted the sorted to set
     */
    public void setSorted(int[] sorted) {
        this.sorted = sorted;
    }

}
