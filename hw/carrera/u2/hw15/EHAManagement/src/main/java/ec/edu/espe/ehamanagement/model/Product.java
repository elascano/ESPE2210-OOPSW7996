package ec.edu.espe.ehamanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Product {
    private int id;
    private String name;
    private float productionCost;
    private String description;
    private ArrayList materialsIds;
    private ArrayList materialsQuantities;
    private int workingTime;
    private int quantity;

    public Product(int id, String name, float productionCost, String description, ArrayList materialsIds, ArrayList materialsQuantities, int workingTime, int quantity) {
        this.id = id;
        this.name = name;
        this.productionCost = productionCost;
        this.description = description;
        this.materialsIds = materialsIds;
        this.materialsQuantities = materialsQuantities;
        this.workingTime = workingTime;
        this.quantity = quantity;
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
     * @return the materialsIds
     */
    public ArrayList getMaterialsIds() {
        return materialsIds;
    }

    /**
     * @param materialsIds the materialsIds to set
     */
    public void setMaterialsIds(ArrayList materialsIds) {
        this.materialsIds = materialsIds;
    }

    /**
     * @return the materialsQuantities
     */
    public ArrayList getMaterialsQuantities() {
        return materialsQuantities;
    }

    /**
     * @param materialsQuantities the materialsQuantities to set
     */
    public void setMaterialsQuantities(ArrayList materialsQuantities) {
        this.materialsQuantities = materialsQuantities;
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
     
    public static ArrayList getAttributesNames(){
        ArrayList keys = new ArrayList(7);
        keys.add("id");
        keys.add("name");
        keys.add("cost");
        keys.add("description");
        keys.add("materialsIds");
        keys.add("materialsQuantities");
        keys.add("workingTime");
        keys.add("quantity");
        return keys;   
    }
    
    public static ArrayList getAttributes(Product product){
        ArrayList values = new ArrayList(7);
        values.add(product.getId());
        values.add(product.getName());
        values.add(product.getProductionCost());
        values.add(product.getDescription());
        values.add(product.getMaterialsIds());
        values.add(product.getMaterialsQuantities());
        values.add(product.getWorkingTime());
        values.add(product.getQuantity());
        return values;
    }
}
