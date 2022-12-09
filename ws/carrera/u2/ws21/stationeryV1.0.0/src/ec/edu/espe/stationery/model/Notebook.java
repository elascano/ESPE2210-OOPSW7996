package ec.edu.espe.stationery.model;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Notebook {
    private int id;
    private int numberOfPages;
    private String type;

    public Notebook(int id, int numberOfPages, String type) {
        this.id = id;
        this.numberOfPages = numberOfPages;
        this.type = type;
    }

    public Notebook() {

    }

    @Override
    public String toString() {
        return "Notebook{" + "id=" + id + ", numberOfPages=" + numberOfPages + ", type=" + type + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages the numberOfPages to set
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
