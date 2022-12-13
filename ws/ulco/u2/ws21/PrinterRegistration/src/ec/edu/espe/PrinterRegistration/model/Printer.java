
package ec.edu.espe.PrinterRegistration.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Printer {
    
    private int id;
    private String brand;
    private String type;

    public Printer(int id, String brand, String type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }
  public Printer() {
        this.id = 0;
        this.brand = "";
        this.type ="";
    }
    @Override
    public String toString() {
        return "Printer{" + "id=" + id + ", brand=" + brand + ", type=" + type + '}';
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    }