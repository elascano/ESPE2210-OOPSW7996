package ec.edu.espe.taxes.model;

import java.text.DecimalFormat;

/**
 *
 * @author NW USER
 */
public class Person {

    private String name;
    int age;
    float netIncome;
    float totalExpenses;
    private float monthSalary;
    float socialSecurity;
    private float rentTax;
DecimalFormat formato2 = new DecimalFormat("#.##");
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", netIncome=" + netIncome + ", totalExpenses=" + totalExpenses + ", monthSalary=" + monthSalary + ", socialSecurity=" + socialSecurity + ", rentTax=" + formato2.format(rentTax) + '}';
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

    public float getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }

    public float getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(float totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public float getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(float monthSalary) {
        this.monthSalary = monthSalary;
    }

    public float getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(float socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public float getRentTax() {
        return rentTax;
    }

    public void setRentTax(float rentTax) {
        this.rentTax = rentTax;
    }

    public Person(String name, int age, float netIncome, float totalExpenses, float monthSalary, float socialSecurity, float rentTax) {
        this.name = name;
        this.age = age;
        this.netIncome = netIncome;
        this.totalExpenses = totalExpenses;
        this.monthSalary = monthSalary;
        this.socialSecurity = socialSecurity;
        this.rentTax = rentTax;
    }

}
