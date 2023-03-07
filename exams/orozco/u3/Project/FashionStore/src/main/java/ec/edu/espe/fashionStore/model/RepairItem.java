package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class RepairItem extends ClothModel {

    String typeOfReparation;

    public RepairItem(String typeOfReparation, int clothModelId, ItemCatalogue itemCatalogue) {
        super(clothModelId, itemCatalogue);
        this.typeOfReparation = typeOfReparation;
    }

    @Override
    public void type(String type) {
        typeOfReparation = type;
    }

}
