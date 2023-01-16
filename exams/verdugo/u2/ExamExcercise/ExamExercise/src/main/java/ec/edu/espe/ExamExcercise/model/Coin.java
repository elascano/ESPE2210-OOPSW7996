/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ExamExcercise.model;

/**
 *
 * @author w_ver
 */
public class Coin {
    private int id;
    private float value;

    /**
     *
     * @param id
     * @param value
     */
    public Coin(int id, float value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coin{" + "id=" + getId() + super.toString() + ", value=" + getValue() + '}';
    }
    
    public Coin() {
        this.id = 0;
        this.value = 0.0F;
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
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }


    
}
