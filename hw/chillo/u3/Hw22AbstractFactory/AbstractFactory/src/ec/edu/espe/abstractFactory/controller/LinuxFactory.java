package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstractFactory.controller.GUIFactory;
import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.LinuxButton;
import ec.edu.espe.abstractFactory.model.LinuxMenu;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class LinuxFactory extends GUIFactory{
    @Override
    public Button createButton() {
        return (new LinuxButton());
    }

    @Override
    public Menu createMenu() {
        return (new LinuxMenu());
    }
}
