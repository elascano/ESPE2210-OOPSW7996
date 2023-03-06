package ec.espe.edu.AbstractFactory.model;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }

}
