package ec.edu.espe.clientapp.controller;

import ec.edu.espe.clientapp.model.Menu;
import ec.edu.espe.clientapp.model.Button;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(int sys){
        //int sys = readFromconfigFile("OS_TYPE");
        if(sys == 0){
        return(new WinFactory());
        }else{
            return(new LinuxFactory());
        }
    }
    public abstract Button createButton();
    public abstract Menu createMenu();
}

