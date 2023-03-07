package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class GradeRecord {

    private ArrayList<Unit> units;

    public GradeRecord() {
        units = new ArrayList<>();
        units.add(new Unit());
        units.add(new Unit());
        units.add(new Unit());
    }

    /**
     * @return the units
     */
    public ArrayList<Unit> getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "GradeRecord{" + "units=" + units + '}';
    }

}
