package ec.edu.espe.taxes.model;

import ec.edu.espe.tax.Tax;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class Person {

    private int id;
    private String name;
    private String category;

    public void getRentTax(float netIncome, float expenses, float iessDeduction) {
        System.out.println("Rent Tax of " + name);
        System.out.println("Net Income: " + netIncome + "$");
        System.out.println("Expenses: " + expenses + "$");
        System.out.println("IEES Deduction: " + iessDeduction + "$");
        System.out.println("Total to pay: " + Tax.computeRentTax(netIncome, expenses, iessDeduction));
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
     * @param Name the Name to set
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
