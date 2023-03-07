package ec.espe.edu.strategypattern.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class SortApp {

    private int[] unordered = new int[10];
    private int[] ordered = new int[10];

    public SortApp(int[] unordered, int[] ordered) {
        this.unordered = unordered;
        this.ordered = ordered;
    }

    /**
     * @return the unordered
     */
    public int[] getUnordered() {
        return unordered;
    }

    /**
     * @param unordered the unordered to set
     */
    public void setUnordered(int[] unordered) {
        this.unordered = unordered;
    }

    /**
     * @return the ordered
     */
    public int[] getOrdered() {
        return ordered;
    }

    /**
     * @param ordered the ordered to set
     */
    public void setOrdered(int[] ordered) {
        this.ordered = ordered;
    }

}
