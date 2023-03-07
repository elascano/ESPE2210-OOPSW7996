package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ClothCatalogue {
    
    private int id;
    private String name;
    private String type;
    private String color;
    
    @Override 
    public String toString() {
        return "Cloth Catalogue:\n" + "Id = \t" + getId() + "\nName = \t" + getName() + "\nType = \t" + getType() + "\nColor = \t" + getColor();
    }

    public ClothCatalogue(int id, String name, String type, String color) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
    }
    public ClothCatalogue() {
        this.id = 0;
        this.name = "";
        this.type = "";
        this.color = "";
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
    
    
    
}

