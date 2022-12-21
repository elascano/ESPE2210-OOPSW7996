/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Instructor  extends UniversityMember {
    private float salary;
    private String Title;

    public Instructor(float salary, String Title, int id, String name, String cedula, ArrayList<NRC> courses) {
        super(id, name, cedula, courses);
        this.salary = salary;
        this.Title = Title;
    }

    @Override
    public String toString() {
        return "Instructor{" + "salary=" + salary + ", Title=" + Title +"  "+ super.toString() + '}';
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    @Override
    public void registerInTheSystem() {
        System.out.println("registering an instructor");
    }
    
}
