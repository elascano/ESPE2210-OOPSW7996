package ec.edu.espe.inclass.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Unit {

    private Grade workshops;
    private Grade homeworks;
    private Grade tests;
    private Grade exam;

    public Unit() {
        workshops = new Grade(new ArrayList<>(), 0.2f);
        homeworks = new Grade(new ArrayList<>(), 0.2f);
        tests = new Grade(new ArrayList<>(), 0.25f);
        exam = new Grade(new ArrayList<>(), 0.35f);
    }

    /**
     * @return the workshops
     */
    public Grade getWorkshops() {
        return workshops;
    }

    /**
     * @param workshops the workshops to set
     */
    public void setWorkshops(Grade workshops) {
        this.workshops = workshops;
    }

    /**
     * @return the homeworks
     */
    public Grade getHomeworks() {
        return homeworks;
    }

    /**
     * @param homeworks the homeworks to set
     */
    public void setHomeworks(Grade homeworks) {
        this.homeworks = homeworks;
    }

    /**
     * @return the tests
     */
    public Grade getTests() {
        return tests;
    }

    /**
     * @param tests the tests to set
     */
    public void setTests(Grade tests) {
        this.tests = tests;
    }

    /**
     * @return the exam
     */
    public Grade getExam() {
        return exam;
    }

    /**
     * @param exam the exam to set
     */
    public void setExam(Grade exam) {
        this.exam = exam;
    }
    
    public float calculateUnitGrade() {
        float unitGrade;
        unitGrade = workshops.calculateGrade() + homeworks.calculateGrade() + tests.calculateGrade() + exam.calculateGrade();
        
        return unitGrade;
    }

    @Override
    public String toString() {
        return "workshops=" + workshops + ", homeworks=" + homeworks + ", tests=" + tests + ", exam=" + exam + " - Unit Grade: " + calculateUnitGrade();
    }

}
