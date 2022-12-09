package ec.edu.espe.myshop.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Table {

    private int id;
    private String wood;
    private String category;

    public Table() {
        this.id = 0;
        this.wood = "";
        this.category = "";
    }

    @Override
    public String toString() {
        return "id=" + id + ", wood=" + wood + ", category=" + category;
    }

    public Table(int id, String name, String ownerName, ArrayList<String> productsName) {
        this.id = id;
        this.wood = name;
        this.category = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWood() {
        return wood;
    }

    public void setWood() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter type of wood of the table");
        wood = scan.nextLine();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter the category of the table");
        category = scan.nextLine();
    }


    public void enterInfo(int nextId) {                                
        setId(nextId);                
        setWood();
        setCategory();
    }
}
