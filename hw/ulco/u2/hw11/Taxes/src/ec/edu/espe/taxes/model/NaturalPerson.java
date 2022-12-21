
package ec.edu.espe.taxes.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class NaturalPerson {
    private int id;
    private String name;
    private float monthlySalary;
    private float rentTax;

    @Override
    public String toString() {
        return "NaturalPerson{" + "id=" + id + ", name=" + name + ", monthlySalary=" + monthlySalary + ", rentTax=" + rentTax + '}';
    }

    public NaturalPerson(int id, String name, float monthlySalary, float rentTax) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.rentTax = rentTax;
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
     * @return the monthlySalary
     */
    public float getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * @param monthlySalary the monthlySalary to set
     */
    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * @return the rentTax
     */
    public float getRentTax() {
        return rentTax;
    }

    /**
     * @param rentTax the rentTax to set
     */
    public void setRentTax(float rentTax) {
        this.rentTax = rentTax;
    }
    
}
