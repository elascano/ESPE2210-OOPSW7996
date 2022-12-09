package ec.edu.espe.Exam.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Chair {
//create attributes (encapsulated with private)
    private String color;
    private String material;
    private boolean adjustable;

    public Chair() {
        color="";
        material="";
        adjustable=false;
    }

    public Chair(String color, String material, boolean adjustable) {
        this.color = color;
        this.material = material;
        this.adjustable = adjustable;
    }

    @Override
    public String toString() {
        return "Chair{" + "color=" + color + ", material=" + material + ", adjustable=" + adjustable + '}';
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAdjustable() {
        return adjustable;
    }

    public void setAdjustable(boolean adjustable) {
        this.adjustable = adjustable;
    }

}
    
 