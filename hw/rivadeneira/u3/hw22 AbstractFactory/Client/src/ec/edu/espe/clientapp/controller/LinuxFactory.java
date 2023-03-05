

package ec.edu.espe.clientapp.controller;

import ec.edu.espe.clientapp.model.Button;
import ec.edu.espe.clientapp.model.LinuxButton;
import ec.edu.espe.clientapp.model.LinuxMenu;
import ec.edu.espe.clientapp.model.Menu;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class LinuxFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return(new LinuxButton());
    }
    @Override
    public Menu createMenu() {
        return(new LinuxMenu());
    }
} 
