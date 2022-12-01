package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Stand {
    private int id;
    private String name;
    private String ownerName;
    private ArrayList<String> productsName;
    
    public Stand() {
        this.id = 0;
        this.name = "";
        this.ownerName = "";
        this.productsName = new ArrayList<>();
    }

    public Stand(int id, String name, String ownerName, ArrayList<String> productsName) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.productsName = productsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<String> getProductsName() {
        return productsName;
    }

    public void setProductsName(ArrayList<String> productsName) {
        this.productsName = productsName;
    }
    
    
}
