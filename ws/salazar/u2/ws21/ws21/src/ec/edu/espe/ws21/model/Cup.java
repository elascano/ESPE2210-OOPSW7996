/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws21.model;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Cup {
    private int id;
    private String color;
    private String baseShape;

    @Override
    public String toString() {
        return "Coin{" + "id=" + id + ", color=" + color + ", baseShape=" + baseShape + '}';
    }

    public Cup(int id, String color, String baseShape) {
        this.id = id;
        this.color = color;
        this.baseShape = baseShape;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBaseShape() {
        return baseShape;
    }

    public void setBaseShape(String baseShape) {
        this.baseShape = baseShape;
    }

}
