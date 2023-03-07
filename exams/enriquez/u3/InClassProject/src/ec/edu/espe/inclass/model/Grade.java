package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Grade {

    private ArrayList<Float> gradeValues;
    private float totalGradePercent;

    public Grade() {
        gradeValues = new ArrayList<>();
        totalGradePercent = 0;
    }

    public Grade(ArrayList<Float> gradeValues, float totalGradePercent) {
        this.gradeValues = gradeValues;
        this.totalGradePercent = totalGradePercent;
    }

    /**
     * @return the gradeValues
     */
    public ArrayList<Float> getGradeValues() {
        return gradeValues;
    }

    /**
     * @param gradeValues the gradeValues to set
     */
    public void setGradeValues(ArrayList<Float> gradeValues) {
        this.gradeValues = gradeValues;
    }

    /**
     * @return the totalGradePercent
     */
    public float getTotalGradePercent() {
        return totalGradePercent;
    }

    /**
     * @param totalGradePercent the totalGradePercent to set
     */
    public void setTotalGradePercent(float totalGradePercent) {
        this.totalGradePercent = totalGradePercent;
    }
    
    public void add(Float value) {
        gradeValues.add(value);
    }
    
    public void modify(int index, Float value) {
        gradeValues.set(index, value);
    }

    @Override
    public String toString() {
        return "Grade{" + "gradeValues=" + gradeValues + ", totalGradePercent=" + totalGradePercent + '}';
    }

    
}
