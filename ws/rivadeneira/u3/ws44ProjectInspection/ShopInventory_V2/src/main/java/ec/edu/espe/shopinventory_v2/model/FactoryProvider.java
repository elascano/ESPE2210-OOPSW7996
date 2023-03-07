
package ec.edu.espe.shopinventory_v2.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class FactoryProvider {

    public ProductFactory getFactory(int option) {
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opcion.\n Porfavor seleccione un producto.", "Advertencia en la selección de datos", JOptionPane.WARNING_MESSAGE);
        } else if (option == 1) {
            return new BeverageFactory();
        } else if (option == 2) {
            return new CandyFactory();
        } else if (option == 3) {
            return new DairyFactory();
        } else if (option == 4) {
            return new GrainFactory();
        } else if (option == 5) {
            return new GroomingFactory();
        } else if (option == 6) {
            return new MeatFactory();
        } else if (option == 7) {
            return new SnackFactory();
        } else if (option == 8) {
            return new VegetableFactory();
        }
        return null;
    }

}
