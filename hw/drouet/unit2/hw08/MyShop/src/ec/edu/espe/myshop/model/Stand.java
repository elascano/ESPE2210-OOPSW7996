package ec.edu.espe.myshop.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Stand {

    private int id;
    private String name;
    private String ownerName;
    private ArrayList<String> products;

    public Stand() {
        this.id = 0;
        this.name = "";
        this.ownerName = "";
        this.products = new ArrayList<>();
    }

    public Stand(int id, String name, String ownerName, ArrayList<String> productsName) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.products = productsName;
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

    public void setName() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter your Stand name");
        name = scan.nextLine();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter your name");
        ownerName = scan.nextLine();
    }

    public ArrayList<String> getProductsName() {
        return products;
    }

    public void setProductsName() {        
        Scanner scan;
        scan = new Scanner(System.in);
        
        products = new ArrayList<>();
                
        String option;
        String productName;
        
        do {
            System.out.println("Enter the name of the new product");
            productName = scan.nextLine();
            products.add(productName);
            System.out.println("Do you want to enter another product? (y/n)");
            option = scan.nextLine();
        } while (option.toLowerCase().equals("y"));
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", products=" + products;
    }

    public void enterInfo(int nextId) {                                
        setId(nextId);                
        setName();
        setOwnerName();
        setProductsName();
    }
}
