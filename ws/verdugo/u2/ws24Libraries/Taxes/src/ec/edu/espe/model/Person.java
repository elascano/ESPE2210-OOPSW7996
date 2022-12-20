
package ec.edu.espe.model;

import ec.edu.espe.tax.Tax;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Person {
    
    private int id;
    private String name;
    private String category; 
    
    public void getRentTax(float netIncome, float expenses, float iessDeduction) {
        System.out.println("==> Rent Tax: " + name);
        System.out.println("==> Net Revenues: " + netIncome + "$");
        System.out.println("==> Other Expenses: " + expenses + "$");
        System.out.println("==> IESS Tax " + iessDeduction + "$");
        System.out.println("Total: " + Tax.computeRentTax(netIncome, expenses, iessDeduction));
    }
    
    public Person(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + getId() + ", Name=" + getName() + ", category=" + getCategory() + '}';
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
     * @return the Name
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
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
}
