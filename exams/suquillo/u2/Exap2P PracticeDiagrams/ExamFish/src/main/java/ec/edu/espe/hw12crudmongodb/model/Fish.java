
package ec.edu.espe.hw12crudmongodb.model;

/**
 *
 * @author Martín Suquillo, TeamWebMaster, DCCO-ESPE
 */
public class Fish {
    private int id;
    private String name;
    private int quantity;
    private float weight;

    @Override
    public String toString() {
        return "Vegetables{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", pricePerUnit=" + weight + '}';
    }

    public Fish(int id, String name, int quantity, float pricePerUnit) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = pricePerUnit;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
