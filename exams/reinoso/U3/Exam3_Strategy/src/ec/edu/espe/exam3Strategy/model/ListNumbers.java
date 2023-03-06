package ec.edu.espe.exam3strategy.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ListNumbers {

    private int listOfNumbersDisordered[];
    private int sizeOfListOfNumbers;
    private String sortAlgorithm;
    private int listOfNumberOrdered[];

    @Override
    public String toString() {
        return "ListNumbers{" + "listOfNumbersDisordered=" + listOfNumbersDisordered + ", sizeOfListOfNumbers=" + sizeOfListOfNumbers + ", sortAlgorithm=" + sortAlgorithm + ", listOfNumberOrdered=" + listOfNumberOrdered + '}';
    }

    public int[] getListOfNumbersDisordered() {
        return listOfNumbersDisordered;
    }

    public void setListOfNumbersDisordered(int[] listOfNumbersDisordered) {
        this.listOfNumbersDisordered = listOfNumbersDisordered;
    }

    public int getSizeOfListOfNumbers() {
        return sizeOfListOfNumbers;
    }

    public void setSizeOfListOfNumbers(int sizeOfListOfNumbers) {
        this.sizeOfListOfNumbers = sizeOfListOfNumbers;
    }

    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] getListOfNumberOrdered() {
        return listOfNumberOrdered;
    }

    public void setListOfNumberOrdered(int[] listOfNumberOrdered) {
        this.listOfNumberOrdered = listOfNumberOrdered;
    }

}
