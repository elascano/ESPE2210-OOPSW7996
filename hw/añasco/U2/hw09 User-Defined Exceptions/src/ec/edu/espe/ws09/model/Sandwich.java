package ec.edu.espe.ws09.model;
/*
  @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Sandwich {
    private int id;
    private String name;
    private boolean hasMeat;
    private float price;
    private String typeOfMeat;

    public Sandwich() {
        id = 0;
        name = "";
        hasMeat = false;
        price = 0;
        typeOfMeat = "";
    }
    
    public Sandwich(int id, String name, boolean hasMeat, String typeOfMeat, float price) {
        this.id = id;
        this.name = name;
        this.hasMeat = hasMeat;
        this.price = price;
        this.typeOfMeat = typeOfMeat;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }
  
    
}
