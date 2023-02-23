package ec.edu.espe.clientapp.controller;

import ec.edu.espe.clientapp.model.WinButton;
import ec.edu.espe.clientapp.model.Menu;
import ec.edu.espe.clientapp.model.WinMenu;
import ec.edu.espe.clientapp.model.Button;


/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class WinFactory extends GUIFactory{
    @Override
    public Button createButton(){
        return(new WinButton());
    }
    
    @Override
    public Menu createMenu(){
        return(new WinMenu());
    }
}
