package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public abstract class GUIFactory {
     public static GUIFactory getFactory() {
        String sysName;        
        sysName = System.getProperty("os.name");
        
        if (sysName.contains("Windows")) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }   

    public abstract Button createButton();

    public abstract Menu createMenu();
}
