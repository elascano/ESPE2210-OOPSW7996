package ec.edu.espe.taxes.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class NaturalPerson {
    private int id;
    private String name;
    private int age;
    private float monthlySalary;
    private float monthlyRentTax;
    private float annualRentTax;

    @Override
    public String toString() {
        return "NaturalPerson{" + "id=" + id + ", name=" + name + ", age=" + age + ", monthlySalary=" + monthlySalary + ", monthlyRentTax=" + monthlyRentTax + ", annualRentTax=" + annualRentTax + '}';
    }

    public NaturalPerson(int id, String name, int age, float monthlySalary, float monthlyRentTax, float annualRentTax) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.monthlySalary = monthlySalary;
        this.monthlyRentTax = monthlyRentTax;
        this.annualRentTax = annualRentTax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public float getMonthlyRentTax() {
        return monthlyRentTax;
    }

    public void setMonthlyRentTax(float monthlyRentTax) {
        this.monthlyRentTax = monthlyRentTax;
    }

    public float getAnnualRentTax() {
        return annualRentTax;
    }

    public void setAnnualRentTax(float annualRentTax) {
        this.annualRentTax = annualRentTax;
    }

    
    
    
}
