package ec.edu.espe.strategy.controller;

import com.google.gson.Gson;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class StrategyArray {

    private int[] unsorted;
    private int size;
    private String sortAlgotithm;
    private int[] sorted;

    public StrategyArray(int[] unsorted, int size, String sortAlgotithm, int[] sorted) {
        this.unsorted = unsorted;
        this.size = size;
        this.sortAlgotithm = sortAlgotithm;
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
     * @return the sortAlgotithm
     */
    public String getSortAlgotithm() {
        return sortAlgotithm;
    }

    /**
     * @param sortAlgotithm the sortAlgotithm to set
     */
    public void setSortAlgotithm(String sortAlgotithm) {
        this.sortAlgotithm = sortAlgotithm;
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

    public String toGson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    
    

    
}
