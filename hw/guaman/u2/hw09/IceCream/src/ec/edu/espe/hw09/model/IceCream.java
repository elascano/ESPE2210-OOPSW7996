package ec.edu.espe.hw09.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class IceCream {
    private String id;
    private String flavor;

    public IceCream(String id, String flavor) {
        this.id = id;
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "IceCream{" + "id=" + id + ", flavor=" + flavor + '}';
    }

    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    
    
    
}
