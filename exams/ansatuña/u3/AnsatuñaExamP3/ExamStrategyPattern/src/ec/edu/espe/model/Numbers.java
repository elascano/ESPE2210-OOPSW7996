
package ec.edu.espe.model;

/**
 *
 * @Loor Cesar,Mendoza Aldric,DDCO-ESPE,GADC.MSI
 */
public class Numbers {

    private int[] NumbersDisordered;
    private int sizeOfListOfNumbers;
    private String sortAlgorithm;
    private int listOfNumberOrdered[];

    @Override
    public String toString() {
        return "ListNumbers{" + "listOfNumbersDisordered=" + NumbersDisordered + ", sizeOfListOfNumbers=" + sizeOfListOfNumbers + ", sortAlgorithm=" + sortAlgorithm + ", listOfNumberOrdered=" + listOfNumberOrdered + '}';
    }

    public int[] getNumbersDisordered() {
        return NumbersDisordered;
    }

    public void setNumbersDisordered(int[] NumbersDisordered) {
        this.NumbersDisordered = NumbersDisordered;
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
