package ec.espe.edu.taxes.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Vehicle {
    private float cylindersection;
    private float cylinder;
    private float age;
    private float greentax;

    @Override
    public String toString() {
        return "Vehicle{" + "cylindersection=" + cylindersection + ", cylinder=" + cylinder + ", age=" + age + ", greentax=" + greentax + '}';
    }

    public Vehicle(float cylindersection, float cylinder, float age, float greentax) {
        this.cylindersection = cylindersection;
        this.cylinder = cylinder;
        this.age = age;
        this.greentax = greentax;
    }

    /**
     * @return the cylindersection
     */
    public float getCylindersection() {
        return cylindersection;
    }

    /**
     * @param cylindersection the cylindersection to set
     */
    public void setCylindersection(float cylindersection) {
        this.cylindersection = cylindersection;
    }

    /**
     * @return the cylinder
     */
    public float getCylinder() {
        return cylinder;
    }

    /**
     * @param cylinder the cylinder to set
     */
    public void setCylinder(float cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * @return the age
     */
    public float getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(float age) {
        this.age = age;
    }

    /**
     * @return the greentax
     */
    public float getGreentax() {
        return greentax;
    }

    /**
     * @param greentax the greentax to set
     */
    public void setGreentax(float greentax) {
        this.greentax = greentax;
    }
   

  
}