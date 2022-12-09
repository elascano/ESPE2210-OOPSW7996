
package ec.edu.espe.shoppingMallProgram.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class StoreInfo {
    
    private String id;
    private String storeName;
    private String storeType;

    public StoreInfo(String id, String storeName, String storeType) {
        this.id = id;
        this.storeName = storeName;
        this.storeType = storeType;
    }
    
    public StoreInfo() {
        this.id = "";
        this.storeName = "";
        this.storeType = "";
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
     * @return the storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * @return the storeType
     */
    public String getStoreType() {
        return storeType;
    }

    /**
     * @param storeType the storeType to set
     */
    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }
    
    
}
