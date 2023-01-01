package ec.edu.espe.model;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Material {
    private int id;
    private String name;
    private float generalQuantity;
    private float unitQuantity;
    private float cost;

    public Material(int id, String name, float generalQuantity, float cost) {
        this.id = id;
        this.name = name;
        this.generalQuantity = generalQuantity;
        this.cost = cost;
    }
    
    public Material() {
    }
    
    
    @Override
    public String toString() {
        return "Material{" + "id=" + id + ", name=" + name + ", quantity=" + generalQuantity + ", cost=" + cost + '}';
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

        public float getGeneralQuantity() {
        return generalQuantity;
    }

    public void setGeneralQuantity(float generalQuantity) {
        this.generalQuantity = generalQuantity;
    }

    public float getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(float unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
