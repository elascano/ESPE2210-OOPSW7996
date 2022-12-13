/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Camera {
    private int id;
    private String model;
    private String flashlight;
    
    public Camera(){
        id=0;
        model="";
        flashlight="";
    }

    public Camera(int id, String model, String flashlight) {
        this.id = id;
        this.model = model;
        this.flashlight = flashlight;
    }
    
    @Override
    public String toString() {
        return "Mouse{" + "id=" + id + ", model=" + model + ", flashlight=" + flashlight + '}';
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFlashlight() {
        return flashlight;
    }

    public void setFlashlight(String flashlight) {
        this.flashlight = flashlight;
    }
    
    
}
