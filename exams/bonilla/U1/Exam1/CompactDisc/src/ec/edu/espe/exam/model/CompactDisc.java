
package ec.edu.espe.exam.model;

public class CompactDisc
{
    private int id;
    private float memory ;
    private String color;

    public int getId() {
        return id;
    }

    public float getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CompactDisc(int id, float memory, String color) {
        this.id = id;
        this.memory = memory;
        this.color = color;
    }

    

    @Override
    public String toString() 
    {
        return "CompactDisc{" + "id=" + id + ", memory=" + memory + ", color=" + color + '}';
    }
    
    
    
}
