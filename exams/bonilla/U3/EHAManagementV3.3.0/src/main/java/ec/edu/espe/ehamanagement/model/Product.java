package ec.edu.espe.ehamanagement.model;


import java.util.HashMap;


/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */

public class Product {
    public int id;
    public String name;
    public float productionCost;
    public String description;
    public HashMap <Integer, Float> materials;
    public int workingTime;
    public int quantity;

    public Product(int id, String name, float productionCost, String description, HashMap materials, int workingTime, int quantity) {
        this.id = id;
        this.name = name;
        this.productionCost = productionCost;
        this.description = description;
        this.materials = materials;
        this.workingTime = workingTime;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", productionCost=" + productionCost + ", description=" + description + ", materials=" + materials + ", workingTime=" + workingTime + ", quantity=" + quantity + '}';
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
     * @return the productionCost
     */
    public float getProductionCost() {
        return productionCost;
    }

    /**
     * @param productionCost the productionCost to set
     */
    public void setProductionCost(float productionCost) {
        this.productionCost = productionCost;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the materials
     */
    public HashMap getMaterials() {
        return materials;
    }

    /**
     * @param materials the materials to set
     */
    public void setMaterials(HashMap materials) {
        this.materials = materials;
    }

    /**
     * @return the workingTime
     */
    public int getWorkingTime() {
        return workingTime;
    }

    /**
     * @param workingTime the workingTime to set
     */
    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
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





}
