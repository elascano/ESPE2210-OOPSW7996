package ec.edu.espe.taxes.model;

import ec.edu.espe.tax.Tax;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Vehicle {

    private int id;
    private String brand;
    private String category;
    private boolean isHybrid;
    private LocalDate year;
    
    public void getGreenTax(int cylinderNumber) {        
        int antiquityInYears;
        
        antiquityInYears = Period.between(year, LocalDate.now()).getYears();                        
        System.out.println("Green Tax of " + category + " - " + brand + " - year " + year.getYear());
        System.out.println("Cylinder Number: " + cylinderNumber);
        System.out.println("Total to pay: " + Tax.computeGreenTax(cylinderNumber, antiquityInYears, isHybrid));
    }

    public Vehicle(int id, String brand, String category, boolean isHybrid, LocalDate year) {
        this.id = id;
        this.brand = brand;
        this.category = category;
        this.isHybrid = isHybrid;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", brand=" + brand + ", category=" + category + ", isHybrid=" + isHybrid + ", year=" + year + '}';
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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

    /**
     * @return the isHybrid
     */
    public boolean isIsHybrid() {
        return isHybrid;
    }

    /**
     * @param isHybrid the isHybrid to set
     */
    public void setIsHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

}
