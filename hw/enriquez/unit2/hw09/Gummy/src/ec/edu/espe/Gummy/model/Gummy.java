
package ec.edu.espe.Gummy.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Gummy {
    private String color;
    private String flavor;
    private String figure;

    public Gummy(String color, String flavor, String figure) {
        this.color = color;
        this.flavor = flavor;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return "Gummy{" + "color=" + color + ", flavor=" + flavor + ", figure=" + figure + '}';
}


    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return the figure
     */
    public String getFigure() {
        return figure;
    }

    /**
     * @param figure the figure to set
     */
    public void setFigure(String figure) {
        this.figure = figure;
    }
}
