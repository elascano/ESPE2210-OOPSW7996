
package ec.edu.espe.SportClub.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Stadium {
    private int id;
    private float width;
    private float lenght;

    @Override
    public String toString() {
        return "{" + "id=" + getId() + ", width=" + getWidth() + ", lenght=" + getLenght() + '}';
    }
    
    
    public Stadium() {
        id = 0;
        width = 0;
        lenght = 0;
    }

    public Stadium(int id, float width, float lenght) {
        this.id = id;
        this.width = width;
        this.lenght = lenght;
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
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the lenght
     */
    public float getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    
    
}
