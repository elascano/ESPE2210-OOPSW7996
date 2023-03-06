package ec.espe.edu.AbstractFactory.model;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory{
    
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
}
