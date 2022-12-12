/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cameraregister.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Camera {
    private int id;
    private String model;
    private float megapixeles;
    
    public Camera(){
        id=0;
        model="";
        megapixeles=0;
    }

    @Override
    public String toString() {
        return "Camera{" + "id=" + id + ", model=" + model + ", megapixeles=" + megapixeles + '}';
    }

    public Camera(int id, String model, float megapixeles) {
        this.id = id;
        this.model = model;
        this.megapixeles = megapixeles;
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the megapixeles
     */
    public float getMegapixeles() {
        return megapixeles;
    }

    /**
     * @param megapixeles the megapixeles to set
     */
    public void setMegapixeles(float megapixeles) {
        this.megapixeles = megapixeles;
    }
    
    
}
