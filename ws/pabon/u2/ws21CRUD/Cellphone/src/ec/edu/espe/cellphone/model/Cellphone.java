package ec.edu.espe.cellphone.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */

public class Cellphone {

    private int id;
    private String brand;
    private String owner;
    private ArrayList<String> model;

    public Cellphone() {
        this.id = 0;
        this.brand = "";
        this.owner = "";
        this.model = new ArrayList<>();
    }

    public Cellphone(int id, String name, String ownerName, ArrayList<String> productsName) {
        this.id = id;
        this.brand = name;
        this.owner = ownerName;
        this.model = productsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setName() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Type the brand of the cellphone");
        brand = scan.nextLine();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwnerName() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Type your name: ");
        owner = scan.nextLine();
    }

    public ArrayList<String> getProductsName() {
        return model;
    }

    public void setProductsName() {        
        Scanner scan;
        scan = new Scanner(System.in);
        
        model = new ArrayList<>();
                
        String option;
        String productName;
        
        do {
            System.out.println("Enter the name of the new product");
            productName = scan.nextLine();
            model.add(productName);
            System.out.println("Do you want to enter another product? (y/n)");
            option = scan.nextLine();
        } while (option.toLowerCase().equals("y"));
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + brand + ", ownerName=" + owner + ", products=" + model;
    }

    public void enterInfo(int nextId) {                                
        setId(nextId);                
        setName();
        setOwnerName();
        setProductsName();
    }
}
