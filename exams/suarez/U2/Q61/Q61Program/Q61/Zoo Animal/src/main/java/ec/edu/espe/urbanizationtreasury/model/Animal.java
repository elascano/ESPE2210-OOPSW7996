package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Animal {

    private String id;
    private String species;
    private String color;

    public Animal(String id, String species, String color) {
        this.id = id;
        this.species = species;
        this.color = color;
    }

    

    @Override
    public String toString() {
        return "Resident{" + "id=" + getId() + ", batch=" + getSpecies() + ", name=" + getColor() + '}';
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    

    /**
     * @return the id
     */
    
}
