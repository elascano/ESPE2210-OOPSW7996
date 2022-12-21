package ec.edu.espe.taxes.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Person {
    
    private String name;
    private float salary;
    private float spent; 

    public Person(String name, float salary, float spent) {
        this.name = name;
        this.salary = salary;
        this.spent = spent;
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
     * @return the spent
     */
    public float getSpent() {
        return spent;
    }

    /**
     * @param spent the spent to set
     */
    public void setSpent(float spent) {
        this.spent = spent;
    }
  
        @Override
    public String toString() {
        return "Person{" + "name=" + name + ", salary=" + salary + ", spent=" + spent + '}';
    }
}
