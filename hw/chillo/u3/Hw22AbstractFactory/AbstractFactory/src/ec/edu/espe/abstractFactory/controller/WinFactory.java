package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstractFactory.controller.GUIFactory;
import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;
import ec.edu.espe.abstractFactory.model.WinButton;
import ec.edu.espe.abstractFactory.model.WinMenu;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class WinFactory extends GUIFactory{
    
    @Override
    public Button createButton() {
        return (new WinButton());
    }

    @Override
    public Menu createMenu() {
        return (new WinMenu());
    }
}
