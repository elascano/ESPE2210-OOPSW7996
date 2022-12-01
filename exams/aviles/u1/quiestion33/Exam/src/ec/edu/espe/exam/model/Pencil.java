/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Pencil {
    private int id;
    private float weight;
    private float length;

    
    public Pencil() {
        id = 0;
        weight=0;
        length=0;
    }
    
    public Pencil(int id, float weight, float length) {
        this.id = id;
        this.weight = weight;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pencil{" + "id=" + id + ", weight=" + weight + ", length=" + length + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    
}
