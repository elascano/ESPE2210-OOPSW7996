package ec.edu.espe.compactdisc.model;


import java.io.Serializable;


public class CompactDisc implements Serializable
{
    String color;
    int id;
    float memory;

    public CompactDisc(String color, int id, float memory) {
        this.color = color;
        this.id = id;
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "VinylRecord{" + "color=" + color + ", id=" + id + ", memory=" + memory + '}';
    }
    
}
