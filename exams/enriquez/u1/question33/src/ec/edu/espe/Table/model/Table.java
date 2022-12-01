package ec.edu.espe.Table.model;

import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Table {

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

    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", color=" + color + ", material=" + material + '}';
    }
    private int id;
    private String color;
    private String material;

    public void setTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter table color: ");
        color = sc.nextLine();
        System.out.println("Enter table material: ");
        material = sc.nextLine();
    }
}
