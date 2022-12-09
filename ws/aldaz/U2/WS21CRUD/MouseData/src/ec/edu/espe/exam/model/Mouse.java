/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Mouse {
    private int id;
    private String name;
    private String type;
    
    public Mouse(){
        id=0;
        name="";
        type="";
    }

    public Mouse(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "Mouse{" + "id=" + id + ", name=" + name + ", type=" + type + '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
