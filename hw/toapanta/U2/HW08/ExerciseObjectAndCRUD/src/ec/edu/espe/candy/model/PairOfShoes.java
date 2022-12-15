package ec.edu.espe.candy.model;

public class PairOfShoes {
    private int id;
    private String color;
    private String material;

    public PairOfShoes(int id, String color, String material) {
        this.id = id;
        this.color = color;
        this.material = material;
    }

    public PairOfShoes() {
        id = 0;
        color = "";
        material = "";
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
