
package ec.edu.espe.taxes.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class People {
    private int id;
    private String name;
    private String category;
    
    public void getRentTax(float netIncome, float expenses, float iessDeduction) {
        System.out.println("Rent Tax of " + name);
        System.out.println("Net Income: " + netIncome + "$");
        System.out.println("Expenses: " + expenses + "$");
        System.out.println("IEES Deduction: " + iessDeduction + "$");
        System.out.println("Total to pay: " + Tax.computeRentTax(netIncome, expenses, iessDeduction));

    public People(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
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
