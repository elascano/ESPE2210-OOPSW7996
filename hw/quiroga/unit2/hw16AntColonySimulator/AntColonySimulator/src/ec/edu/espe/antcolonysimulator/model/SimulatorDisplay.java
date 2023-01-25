
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SimulatorDisplay {
   private Area area;
   
   
   public static void monitors(){
       System.out.println("Monitor");
   }

    @Override
    public String toString() {
        return "SimulatorDisplay{" + "area:" + area + "}";
    }
   
   
    public SimulatorDisplay() {
        this.area = null;
    }

    public SimulatorDisplay(Area area) {
        this.area = area;
    }

    /**
     * @return the area
     */
    public Area getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Area area) {
        this.area = area;
    }
     
}
