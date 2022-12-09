package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Catalogue {
    
    private ClothModel clothModel;
    
    public Catalogue(){
        clothModel= new ClothModel();
    }

    /**
     * @return the clothModel
     */
    public ClothModel getClothModel() {
        return clothModel;
    }

    /**
     * @param clothModel the clothModel to set
     */
    public void setClothModel(ClothModel clothModel) {
        this.clothModel = clothModel;
    }

 }

