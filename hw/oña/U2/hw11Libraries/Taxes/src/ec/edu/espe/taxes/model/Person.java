
package ec.edu.espe.taxes.model;
import java.text.DecimalFormat;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Person extends Product{
    private float salary;
    DecimalFormat formato1= new DecimalFormat("#.00");
    public Person(float salary, int id, String description, float price, float salePrice) {
        super(id, description, price, salePrice);
        this.salary = salary;
    }

    @Override
    public String toString() {
        String person="";
        person = "Person{"+getDescription()+","+"Salary Anual="+getSalary()+","+"Ren Tax="
                + formato1.format(getPrice())+"}";
        return person;
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
    
    
    
}
