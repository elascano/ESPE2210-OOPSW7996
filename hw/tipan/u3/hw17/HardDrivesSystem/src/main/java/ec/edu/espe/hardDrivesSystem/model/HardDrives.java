package ec.edu.espe.hardDrivesSystem.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class HardDrives {

    private String id;
    private String interfac ;
    private String storage;

    public HardDrives(String id, String name, String type) {
        this.id = id;
        this.interfac = name;
        this.storage = type;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + interfac + ", type=" + storage + '}';
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
     * @return the interfac
     */
    public String getInterfac() {
        return interfac;
    }

    /**
     * @param interfac the interfac to set
     */
    public void setInterfac(String interfac) {
        this.interfac = interfac;
    }

    /**
     * @return the storage
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }
    
    


}
