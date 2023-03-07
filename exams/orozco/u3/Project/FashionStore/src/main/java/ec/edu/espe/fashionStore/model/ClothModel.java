package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public abstract class ClothModel {
    private int clothModelId;
    private ItemCatalogue itemCatalogue;

    public abstract void type(String type);
    
    public ClothModel(int clothModelId, ItemCatalogue itemCatalogue) {
        this.clothModelId = clothModelId;
        this.itemCatalogue = itemCatalogue;
    }

    /**
     * @return the clothModelId
     */
    public int getClothModelId() {
        return clothModelId;
    }

    /**
     * @param clothModelId the clothModelId to set
     */
    public void setClothModelId(int clothModelId) {
        this.clothModelId = clothModelId;
    }

    /**
     * @return the itemCatalogue
     */
    public ItemCatalogue getItemCatalogue() {
        return itemCatalogue;
    }

    /**
     * @param itemCatalogue the itemCatalogue to set
     */
    public void setItemCatalogue(ItemCatalogue itemCatalogue) {
        this.itemCatalogue = itemCatalogue;
    }
    
    
}
