
package ec.edu.espe.ws21PairOfShoes.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class PairOfShoes {
    private int id;
    private String brand;
    private int size;

    @Override
    public String toString() {
        return "PairOfShoes{" + "id=" + id + ", brand=" + brand + ", size=" + size + '}';
    }

    public PairOfShoes(int id, String brand, int size) {
        this.id = id;
        this.brand = brand;
        this.size = size;
    }
   
   public PairOfShoes(){
       id=0;
       brand="";
       size=0;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}