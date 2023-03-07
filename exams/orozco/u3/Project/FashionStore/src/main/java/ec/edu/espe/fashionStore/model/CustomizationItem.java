package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class CustomizationItem extends ClothModel {

    String typeOfCustomization;

    public CustomizationItem(String typeOfCustomization, int clothModelId, ItemCatalogue itemCatalogue) {
        super(clothModelId, itemCatalogue);
        this.typeOfCustomization = typeOfCustomization;
    }

    @Override
    public void type(String type) {
        typeOfCustomization = type;
    }

}
