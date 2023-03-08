package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class Rate {

    private String name;
    private String rating;
    private String comment;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Rate(String name, String rating, String comment) {
        this.name = name;
        this.rating = rating;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Rate{" + "name=" + getName() + ", rating=" + getRating() + ", comment=" + getComment() + '}';
    }

}
