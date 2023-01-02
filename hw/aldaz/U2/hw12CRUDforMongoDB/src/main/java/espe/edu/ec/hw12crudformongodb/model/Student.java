
package espe.edu.ec.hw12crudformongodb.model;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private ArrayList<Double> grades;

    public Student() {
        id = 0;
        name = "";
        age = 0;
        grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", grades=" + grades + '}';
    }

    

    public Student(int id, String name, int age, ArrayList<Double> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the grades
     */
    public ArrayList<Double> getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }
}
