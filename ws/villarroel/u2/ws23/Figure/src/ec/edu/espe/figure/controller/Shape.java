
package ec.edu.espe.figure.controller;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public abstract class Shape {
    private int base;
    private int height;

    public Shape(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public abstract void perimeter(int base, int height);
    
    public abstract void area(int base, int height);
    
    
    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
