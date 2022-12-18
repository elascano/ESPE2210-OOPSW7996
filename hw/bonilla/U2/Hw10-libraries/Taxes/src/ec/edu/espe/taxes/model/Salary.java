
package ec.edu.espe.taxes.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class Salary
{
    private float salario;
    private float rentTax;

    public Salary(float salario, float rentTax) {
        this.salario = salario;
        this.rentTax = rentTax;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getRentTax() {
        return rentTax;
    }

    public void setRentTax(float rentTax) {
        this.rentTax = rentTax;
    }

    @Override
    public String toString() {
        return "Salary{" + "monthly salary=" + salario + ", rentTax=" + rentTax + '}';
    }
    
}
